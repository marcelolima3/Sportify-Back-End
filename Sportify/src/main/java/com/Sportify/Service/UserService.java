package com.Sportify.Service;


import com.Sportify.DAO.user.UserDAO;
import com.Sportify.Entities.event.Event;
import com.Sportify.Entities.event.EventCategory;
import com.Sportify.Entities.payment.InvoicePayment;
import com.Sportify.Entities.payment.MonthlyBill;
import com.Sportify.Entities.payment.PaymentMethod;
import com.Sportify.Entities.user.Subscription;
import com.Sportify.Entities.user.User;
import com.Sportify.Managers.UsersManagement;
import org.orm.PersistentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.nio.cs.US_ASCII;

import java.util.*;

@Service
public class UserService {

    public List<User> getUsers(){
        try {
            return (List<User>)UserDAO.queryUser(null, null);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public int registerUser(User user) throws Exception {
        boolean exist = false;
        try {
            for (User u : (List<User>) UserDAO.queryUser(null, null)) {
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
            //user.setPaymentManager(new InvoicePayment(10));
            user.setRegistrationDate(new Date());
            try {
                UserDAO.save(user);
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
            User u = UserDAO.getUserByORMID(id);
            u.setDefaultNotificationType(user.getDefaultNotificationType());
            u.setPaymentManager(user.getPaymentManager());
            UserDAO.save(u);
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
