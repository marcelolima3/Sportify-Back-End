package com.Sportify.Service;


import com.Sportify.DAO.event.EventCategoryDAO;
import com.Sportify.DAO.subentities.SubscriptionEntityDAO;
import com.Sportify.DAO.user.UserDAO;
import com.Sportify.Entities.competition.MatchEvent;

import com.Sportify.Entities.event.Event;
import com.Sportify.Entities.event.EventCategory;
import com.Sportify.Entities.payment.*;
import com.Sportify.Entities.subentities.SubscriptionEntity;
import com.Sportify.Entities.user.NotificationTracker;
import com.Sportify.Entities.user.Subscription;
import com.Sportify.Entities.user.User;
import org.orm.PersistentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

@Service
public class UserService {
    @Autowired private UserDAO userDAO;

    public User getUser(int id){
        try {
            User u = userDAO.getUserByORMID(id);
            return u;
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<User> getUsers(){
        try {
            return (List<User>) userDAO.queryUser(null, null);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public int registerUser(User user) throws Exception {
        boolean exist = false;
        try {
            for (User u : (List<User>) userDAO.queryUser(null, null)) {
                if (u.getEmail().equals(user.getEmail())) {
                    exist = true;
                    break;
                }
            }
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        if (!exist) {
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

    public void changeOptions(int id, User user){
        try {
            User u = userDAO.getUserByORMID(id);
            u.setDefaultNotificationType(user.getDefaultNotificationType());
            u.setPaymentManager(user.getPaymentManager());
            userDAO.save(u);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
    }

    public List<EventCategory> getSEEventCategories(int userID, int subscriptionEntityID){
        try {
            User u = userDAO.getUserByORMID(userID);

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
            User u = userDAO.getUserByORMID(id);
            return Arrays.asList(u.subscriptions.toArray());
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public User login(User user) {
        try {
            String email = user.getEmail();
            String password = user.getPassword();
            List<User> list = userDAO.queryUser("Email = '" + email + "' and Password = '" + password + "'", null);
            if( list.size() > 0 ) {
                return list.get(0);
            }
            else return null;

        } catch (PersistentException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void subscribe(int id, int idSE, Subscription subscription) {
        try {
            boolean existSub = false; boolean regular_price;
            User u = userDAO.getUserByORMID(id);
            SubscriptionEntity subscriptionEntity = SubscriptionEntityDAO.getSubscriptionEntityByORMID(idSE);
            EventCategory eventCategory = null;
            for(EventCategory ec : (Set<EventCategory>) subscription.getORM_SubscribedEvents()){
                eventCategory = EventCategoryDAO.getEventCategoryByORMID(ec.getID());
                break;
            }

            if (subscriptionEntity instanceof MatchEvent)
                regular_price = true;
            else regular_price = false;

            for (Subscription sub : u.subscriptions.toArray()) {
                if (sub.getSubscribedEntity().equals(subscriptionEntity) && !sub.getPaid() && !sub.subscribedEvents.contains(eventCategory)) {
                    existSub = true;
                    sub.subscribedEvents.add(eventCategory);
                    if(regular_price)
                        u.getPaymentManager().addToBill(eventCategory.getRegularPrice());
                    else
                        u.getPaymentManager().addToBill(eventCategory.getExtraPrice());
                    userDAO.save(u);
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
                s.subscribedEvents.add(eventCategory);
                u.subscriptions.add(s);
                if(regular_price)
                    u.getPaymentManager().addToBill(eventCategory.getRegularPrice());
                else
                    u.getPaymentManager().addToBill(eventCategory.getExtraPrice());
                userDAO.save(u);
            }
        }
        catch (PersistentException e) { e.printStackTrace(); }
    }

    /**public static void main(String[] args){
        UserService us = new UserService();
        Subscription s = new Subscription();
        s.setDate(new Date());
        s.setPaid(false);
        NotificationTracker nt = new NotificationTracker();
        nt.setNotificationPolicy("HEHE");
        s.set_tracker(nt);

        try {
            s.subscribedEvents.add(EventCategoryDAO.getEventCategoryByORMID(1));
        } catch (PersistentException e) {
            e.printStackTrace();
        }

        us.subscribe(1, 29, s);
    }**/

    public Invoice payService(int id) {
        try {
            User u = UserDAO.getUserByORMID(id);
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
            UserDAO.save(u);
            return i;
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return null;
    }

    public PaymentMethod getPaymentMethod(int id) {
        try {
            User u = userDAO.getUserByORMID(id);
            return u.getPaymentManager();
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return null;
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

    public List<Event> consultNotifications(int id) {
        try {
            User u = UserDAO.getUserByORMID(id);
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
}
