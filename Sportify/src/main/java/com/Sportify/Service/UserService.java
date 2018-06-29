package com.Sportify.Service;


import com.Sportify.DAO.subentities.SubscriptionEntityDAO;
import com.Sportify.DAO.user.UserDAO;
import com.Sportify.Entities.event.Event;
import com.Sportify.Entities.event.EventCategory;
import com.Sportify.Entities.subentities.SubscriptionEntity;
import com.Sportify.Entities.user.NotificationTracker;
import com.Sportify.Entities.user.Subscription;
import com.Sportify.Entities.user.User;
import org.orm.PersistentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {
    @Autowired private UserDAO userDAO;

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
            //com.Sportify.Entities.user.setPaymentManager(new InvoicePayment(10));
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

    public boolean login(User user) {
        try {
            String email = user.getEmail();
            String password = user.getPassword();
            List list = userDAO.queryUser("Email = '" + email + "' and Password = '" + password + "'", null);
            return list.size() > 0;
        } catch (PersistentException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void subscribe(int id, int idSE, EventCategory eventCategory) {
        try {
            boolean existSub = false;
            User u = userDAO.getUserByORMID(id);
            SubscriptionEntity subscriptionEntity = SubscriptionEntityDAO.getSubscriptionEntityByORMID(idSE);
            for (Subscription subscription : u.subscriptions.toArray()) {
                if (subscription.getSubscribedEntity().equals(subscriptionEntity) && !subscription.subscribedEvents.contains(eventCategory)) {
                    existSub = true;
                    subscription.subscribedEvents.add(eventCategory);
                    //u.getPaymentManager().addToBill(eventCategory.getPrice());
                    userDAO.save(u);
                } else if (subscription.getSubscribedEntity().equals(subscriptionEntity)) {
                    existSub = true;
                }
            }
            if (!existSub) {
                Subscription s = new Subscription();
                s.setDate(new Date());
                s.setSubscribedEntity(subscriptionEntity);
                NotificationTracker nt = new NotificationTracker();
                nt.setNotificationPolicy(u.getDefaultNotificationType());
                s.set_tracker(nt);
                s.subscribedEvents.add(eventCategory);
                u.subscriptions.add(s);
                //u.getPaymentManager().addToBill(eventCategory.getPrice());
                userDAO.save(u);
            }
        }
        catch (PersistentException e) { e.printStackTrace(); }
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
