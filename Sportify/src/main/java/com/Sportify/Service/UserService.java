package com.Sportify.Service;


import com.Sportify.DAO.competition.ModalityDAO;
import com.Sportify.DAO.event.EventCategoryDAO;
import com.Sportify.DAO.subentities.AthleteDAO;
import com.Sportify.DAO.subentities.SubscriptionEntityDAO;
import com.Sportify.DAO.subentities.TeamDAO;
import com.Sportify.DAO.user.UserDAO;
import com.Sportify.Entities.competition.MatchEvent;

import com.Sportify.Entities.event.Event;
import com.Sportify.Entities.event.EventCategory;
import com.Sportify.Entities.notPresist.NotificationResponse;
import com.Sportify.Entities.payment.*;
import com.Sportify.Entities.subentities.Athlete;
import com.Sportify.Entities.subentities.SubscriptionEntity;
import com.Sportify.Entities.subentities.Team;
import com.Sportify.Entities.user.NotificationTracker;
import com.Sportify.Entities.user.Subscription;
import com.Sportify.Entities.user.User;
import com.Sportify.PubSub.Notification;
import org.orm.PersistentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

@Service
public class UserService {

    @Autowired private UserDAO userDAO;
    @Autowired private SubscriptionEntityDAO subscriptionEntityDAO;
    @Autowired private EventCategoryDAO eventCategoryDAO;
    @Autowired private TeamDAO teamDAO;
    @Autowired private ModalityDAO modalityDAO;
    @Autowired private AthleteDAO athleteDAO;

    public User getUser(int id){
        try {
            User u = userDAO.getUserByORMID( id);
            return u;
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<User> getUsers(){
        try {
            return (List<User>) userDAO.queryUser( null, null);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public int registerUser(User user) throws PersistentException, Exception {
        boolean exist = false;
        try {
            for (User u : (List<User>) userDAO.queryUser( null, null)) {
                if (u.getEmail().equals(user.getEmail())) {
                    exist = true;
                    break;
                }
            }
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        if (!exist) {
            user.setPassword(gen_pass(user.getPassword()));
            user.setORM_Subscriptions(new HashSet());
            user.setDefaultNotificationType("default");
            user.setRegistrationDate(new Date());
            try {
                userDAO.save(user);
            } catch (PersistentException e) {
                e.printStackTrace();
            }
            return user.getID();
        } else {
            throw new Exception("Email already in use!");
        }
    }

    public void changeOptions(int id, User user) throws PersistentException {
        try {
            User u = userDAO.getUserByORMID( id);
            u.setDefaultNotificationType(user.getDefaultNotificationType());
            u.setPaymentManager(user.getPaymentManager());
            userDAO.save(u);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
    }

    public List<EventCategory> getSEEventCategories(int userID, int subscriptionEntityID){
        try {
            User u = userDAO.getUserByORMID( userID);

            for (Subscription subscription : u.subscriptions.toArray()) {
                if(subscription.getSubscribedEntity().getID() == subscriptionEntityID){
                    return Arrays.asList(subscription.subscribedEvents.toArray());
                }
            }
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public List<Subscription> getSubscriptions(int id){
        try {
            User u = userDAO.getUserByORMID( id);
            return Arrays.asList(u.subscriptions.toArray());
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public User login(User user) {
        try {
            String email = user.getEmail();
            String password = gen_pass(user.getPassword());
            List<User> list = userDAO.queryUser( "Email = '" + email + "' and Password = '" + password + "'", null);
            if( list.size() > 0 ) {
                return list.get(0);
            }
            else return null;

        } catch (PersistentException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void subscribe(int id, int idSE, Subscription subscription) throws PersistentException {
        try {
            boolean existSub = false; boolean regular_price;
            User u = userDAO.getUserByORMID(id);

            SubscriptionEntity subscriptionEntity = subscriptionEntityDAO.getSubscriptionEntityByORMID( idSE);

            EventCategory eventCategory = null;
            for(EventCategory ec : (Set<EventCategory>) subscription.getORM_SubscribedEvents()){
                eventCategory = eventCategoryDAO.getEventCategoryByORMID( ec.getID());
                break;
            }

            if (subscriptionEntity instanceof MatchEvent)
                regular_price = true;
            else regular_price = false;

            for (Subscription sub : u.subscriptions.toArray()) {
                if (sub.getSubscribedEntity().equals(subscriptionEntity) && !sub.getPaid() && !sub.subscribedEvents.contains(eventCategory)) {
                    existSub = true;
                    sub.getORM_SubscribedEvents().add(eventCategory);
                    if(regular_price)
                        u.getPaymentManager().addToBill(eventCategory.getRegularPrice());
                    else
                        u.getPaymentManager().addToBill(eventCategory.getExtraPrice());
                } else if (sub.getSubscribedEntity().equals(subscriptionEntity) && !sub.getPaid()) {
                    existSub = true;
                }
            }
            if (!existSub) {
                Subscription s = new Subscription();
                s.setDate(subscription.getDate());
                s.setSubscribedEntity(subscriptionEntity);
                s.setPaid(false);
                NotificationTracker nt = new NotificationTracker();
                nt.setNotificationPolicy(subscription.get_tracker().getNotificationPolicy());
                s.set_tracker(nt);
                s.getORM_SubscribedEvents().add(eventCategory);
                u.subscriptions.add(s);
                if(regular_price)
                    u.getPaymentManager().addToBill(eventCategory.getRegularPrice());
                else
                    u.getPaymentManager().addToBill(eventCategory.getExtraPrice());
            }
            userDAO.save(u);
        }
        catch (PersistentException e) {
            e.printStackTrace();
        }
    }

    public Invoice payService(int id) throws PersistentException {
        try {
            User u = userDAO.getUserByORMID( id);
            PaymentMethod paymentMethod = u.getPaymentManager();
            double price; Date date = new Date();
            Invoice i = new Invoice();

            if (paymentMethod instanceof MonthlyBill) {
                i.setDate(date);
                for (Subscription subscription : u.subscriptions.toArray()) {
                    if (!subscription.getPaid()) {
                        i.subscriptions.add(subscription);
                        subscription.setPaid(true);
                    }
                }
                price = ((MonthlyBill) paymentMethod).getCurrentAmount();
                i.setAmount(price);
                ((MonthlyBill) paymentMethod).setCurrentAmount(0);
                ((MonthlyBill) paymentMethod).payments.add(i);

            } else
            /** if (paymentMethod instanceof InvoicePayment) **/
            {
                i.setDate(date);
                for (Subscription subscription : u.subscriptions.toArray()) {
                    if (!subscription.getPaid()) {
                        i.subscriptions.add(subscription);
                        subscription.setPaid(true);
                    }
                }
                price = ((InvoicePayment) paymentMethod).getCurrentAmount();
                i.setAmount(price);
                ((InvoicePayment) paymentMethod).setCurrentAmount(0);
                ((InvoicePayment) paymentMethod).payments.add(i);

            }
            /**else {
                ((PrepaidCard) paymentMethod).setNumRecharges(((PrepaidCard) paymentMethod).getNumRecharges() + 1);
                price = 100;
                ((PrepaidCard) paymentMethod).setBalance(100);
            }**/
            saveTransaction(id, price, date);
            userDAO.save(u);
            return i;
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return null;
    }

    public PaymentMethod getPaymentMethod(int id) {
        try {
            User u = userDAO.getUserByORMID( id);
            return u.getPaymentManager();
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Event> consultNotifications(int id) {
        try {
            User u = userDAO.getUserByORMID( id);
            List<Event> notificationList = new ArrayList<>();
            for (Subscription subscription : u.subscriptions.toArray()) {
                notificationList.addAll(Arrays.asList(subscription.get_tracker().notificationHistory.toArray()));
            }
            return notificationList;
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public List<NotificationResponse> consultNotificationsBySport(int id, int sport) {
        try {
            int sport_id = 0;
            int modality_id = 0;
            String name;
            User u = userDAO.getUserByORMID(id);

            List<NotificationResponse> notificationList = new ArrayList<>();

            for (Subscription subscription : u.subscriptions.toArray()) {
                SubscriptionEntity subscriptionEntity = subscription.getSubscribedEntity();
                id = subscriptionEntity.getID();
                if(subscriptionEntity instanceof Team){
                    name = ((Team) subscriptionEntity).getName();
                    modality_id = (int) teamDAO.queryTeam("SubscriptionEntityID = " + subscriptionEntity.getID(), null).get(0);
                    sport_id = (int) modalityDAO.queryModality("ID = " + modality_id, null).get(0);
                }
                else if(subscriptionEntity instanceof Athlete){
                    name = ((Athlete) subscriptionEntity).getName();
                    int team_id = ((Athlete) subscriptionEntity).getTeam().getID();
                    modality_id = (int) teamDAO.queryTeam("SubscriptionEntityID = " + team_id, null).get(0);
                    sport_id = (int) modalityDAO.queryModality("ID = " + modality_id, null).get(0);
                }
                else{
                    name = ((MatchEvent) subscriptionEntity).getDescription();
                    Athlete athlete = (Athlete) ((MatchEvent)subscriptionEntity).athletes.getIterator().next();
                    int team_id = athlete.getTeam().getID();
                    modality_id = (int) teamDAO.queryTeam("SubscriptionEntityID = " + team_id, null).get(0);
                    sport_id = (int) modalityDAO.queryModality("ID = " + modality_id, null).get(0);
                }

                if(sport == sport_id) {
                    for (Event event : subscription.get_tracker().notificationHistory.toArray()) {
                        NotificationResponse notificationResponse = new NotificationResponse(event, name, subscriptionEntity.getClass().toString(), id);
                        notificationList.add(notificationResponse);
                    }
                }
            }

            return notificationList;
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public List<Subscription> consultSubscriptionsBySport(int id, int sport) {
        try {
            int sport_id = 0;
            User u = userDAO.getUserByORMID(id);

            List<Subscription> subscriptionList = new ArrayList<>();

            for (Subscription subscription : u.subscriptions.toArray()) {
                SubscriptionEntity subscriptionEntity = subscription.getSubscribedEntity();
                if(subscriptionEntity instanceof Team){
                    int modality_id = (int) teamDAO.queryTeam("SubscriptionEntityID = " + subscriptionEntity.getID(), null).get(0);
                    sport_id = (int) modalityDAO.queryModality("ID = " + modality_id, null).get(0);
                }
                else if(subscriptionEntity instanceof Athlete){
                    int team_id = ((Athlete) subscriptionEntity).getTeam().getID();
                    int modality_id = (int) teamDAO.queryTeam("SubscriptionEntityID = " + team_id, null).get(0);
                    sport_id = (int) modalityDAO.queryModality("ID = " + modality_id, null).get(0);
                }
                else{
                    Athlete athlete = (Athlete) ((MatchEvent)subscriptionEntity).athletes.getIterator().next();
                    int team_id = athlete.getTeam().getID();
                    int modality_id = (int) teamDAO.queryTeam("SubscriptionEntityID = " + team_id, null).get(0);
                    sport_id = (int) modalityDAO.queryModality("ID = " + modality_id, null).get(0);
                }

                if(sport == sport_id)
                    subscriptionList.addAll(Arrays.asList(subscription));
            }

            return subscriptionList;
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    private void saveTransaction(int user_id, double price, Date date) {
        try {
            String transaction = "[" + date.toString() + "] User: " + user_id + " ------------------> " + price + " €. \n";
            String filename = "user_transactions.txt";
            FileWriter fw = new FileWriter(filename, true);
            fw.write(transaction);
            fw.close();
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }

    }

    private String gen_pass(String password){
        MessageDigest digest = null;
        try {
            digest = MessageDigest.getInstance("SHA-256");
        }
        catch (NoSuchAlgorithmException e) { e.printStackTrace(); }
        byte[] hash = digest.digest(password.getBytes(StandardCharsets.UTF_8));

        return Base64.getEncoder().encodeToString(hash);
    }
}
