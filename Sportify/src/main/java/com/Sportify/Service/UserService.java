package com.Sportify.Service;


import com.Sportify.Entities.event.EventCategory;
import com.Sportify.Entities.payment.PaymentMethod;
import com.Sportify.Entities.user.Subscription;
import com.Sportify.Managers.UsersManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UsersManagement usersManagement;

    public int registerUser(String name, String email, String password, PaymentMethod p) throws Exception {
        return usersManagement.registerUser(name, email, password, p);
    }

    public void changeOptions(int id, String defaultNotificationType, PaymentMethod p){
        usersManagement.changeOptions(id, defaultNotificationType, p);
    }

    public List<EventCategory> getSEEventCategories(int userID, int subscriptionEntityID){
        return usersManagement.getSEEventCategories(userID, subscriptionEntityID);
    }

    public List<Subscription> getSubscriptions(int id){
        return usersManagement.getSubscriptions(id);
    }
}
