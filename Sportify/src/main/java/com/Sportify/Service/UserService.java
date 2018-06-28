package com.Sportify.Service;


import com.Sportify.DAO.user.UserDAO;
import com.Sportify.Entities.event.EventCategory;
import com.Sportify.Entities.payment.PaymentMethod;
import com.Sportify.Entities.user.Subscription;
import com.Sportify.Entities.user.User;
import com.Sportify.Managers.UsersManagement;
import org.orm.PersistentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class UserService {

    public int registerUser(String name, String email, String password, PaymentMethod p) throws Exception {
        boolean exist = false;
        try {
            for (User u : (List<User>) UserDAO.queryUser(null, null)) {
                if (u.getEmail().equals(email)) {
                    exist = true;
                    break;
                }
            }
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        if (!exist) {
            User u = new User();
            u.setName(name);
            u.setEmail(email);
            u.setPassword(password);
            u.setPaymentManager(p);
            u.setRegistrationDate(new Date());
            try {
                UserDAO.save(u);
            } catch (PersistentException e) {
                e.printStackTrace();
            }
            return u.getID();
        } else {
            throw new Exception("Email already in use!");
        }
    }

    public void changeOptions(int id, String defaultNotificationType, PaymentMethod p){
        try {
            User u = UserDAO.getUserByORMID(id);
            u.setDefaultNotificationType(defaultNotificationType);
            u.setPaymentManager(p);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
    }

    public List<EventCategory> getSEEventCategories(int userID, int subscriptionEntityID){
        try {
            User u = UserDAO.getUserByORMID(userID);

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
            User u = UserDAO.getUserByORMID(id);
            return Arrays.asList(u.subscriptions.toArray());
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}
