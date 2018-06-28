package com.Sportify.Managers;

import com.Sportify.DAO.user.UserDAO;
import com.Sportify.Entities.event.Event;
import com.Sportify.Entities.event.EventCategory;
import com.Sportify.Entities.payment.*;
import com.Sportify.Entities.subentities.SubscriptionEntity;
import com.Sportify.Entities.user.Subscription;
import com.Sportify.Entities.user.User;
import org.orm.PersistentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;

@Service
public class UsersManagement {


    public UsersManagement() {
    }

    // Tem de dar throw de uma exception se o utilizador não for criado!
    public Integer registerUser(String name, String email, String password, PaymentMethod p) throws Exception{
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

    // Aqui falta o AddToBill
    public void subscribe(int id, SubscriptionEntity subscriptionEntity, EventCategory eventCategory) {
        try {
            boolean existSub = false;
            User u = UserDAO.getUserByORMID(id);
            for (Subscription subscription : u.subscriptions.toArray()) {
                if (subscription.getSubscribedEntity().equals(subscriptionEntity) && !subscription.subscribedEvents.contains(eventCategory)) {
                    existSub = true;
                    subscription.subscribedEvents.add(eventCategory);
                    //u.getPaymentManager().addToBill(eventCategory.getPrice());
                    UserDAO.save(u);
                } else if (subscription.getSubscribedEntity().equals(subscriptionEntity)) {
                    existSub = true;
                }
            }
            if (!existSub) {
                Subscription s = new Subscription();
                s.setDate(new Date());
                s.setSubscribedEntity(subscriptionEntity);
                s.subscribedEvents.add(eventCategory);
                u.subscriptions.add(s);
                //u.getPaymentManager().addToBill(eventCategory.getPrice());
                UserDAO.save(u);
            }
        } catch (PersistentException e) {
            e.printStackTrace();
        }
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

    public List<Event> consult_notifications(int id) throws PersistentException {
        User u = UserDAO.getUserByORMID(id);
        List<Event> notificationList = new ArrayList<>();
        for (Subscription subscription : u.subscriptions.toArray()) {
            notificationList.addAll(Arrays.asList(subscription.get_tracker().notificationHistory.toArray()));
        }
        return notificationList;
    }

    public void payService(int id) {
        try {
            User u = UserDAO.getUserByORMID(id);
            PaymentMethod paymentMethod = u.getPaymentManager();
            if (paymentMethod instanceof MonthlyBill) {
                Invoice i = new Invoice();
                i.setDate(new Date());
                for (Subscription subscription : u.subscriptions.toArray()) {
                    if (!subscription.getPaid()) {
                        i.subscriptions.add(subscription);
                        subscription.setPaid(true);
                    }
                }
                i.setAmount(((MonthlyBill) paymentMethod).getCurrentAmount());
                ((MonthlyBill) paymentMethod).setCurrentAmount(0);
                ((MonthlyBill) paymentMethod).payments.add(i);
            } else if (paymentMethod instanceof InvoicePayment) {
                Invoice i = new Invoice();
                i.setDate(new Date());
                for (Subscription subscription : u.subscriptions.toArray()) {
                    if (!subscription.getPaid()) {
                        i.subscriptions.add(subscription);
                        subscription.setPaid(true);
                    }
                }
                i.setAmount(((InvoicePayment) paymentMethod).getCurrentAmount());
                ((InvoicePayment) paymentMethod).setCurrentAmount(0);
                ((InvoicePayment) paymentMethod).payments.add(i);
            } else {
                ((PrepaidCard) paymentMethod).setNumRecharges(((PrepaidCard) paymentMethod).getNumRecharges() + 1);
                ((PrepaidCard) paymentMethod).setBalance(10);
            }
        } catch (PersistentException e) {
            e.printStackTrace();
        }
    }
}