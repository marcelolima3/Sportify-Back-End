package com.Sportify.Controllers;

import com.Sportify.Entities.event.Event;
import com.Sportify.Entities.event.EventCategory;
import com.Sportify.Entities.payment.Invoice;
import com.Sportify.Entities.payment.PaymentMethod;
import com.Sportify.Entities.user.Subscription;
import com.Sportify.Entities.user.User;
import com.Sportify.Service.UserService;
import com.Sportify.Views.JSONViews.event.EventCategoryView;
import com.Sportify.Views.JSONViews.payment.InvoiceView;
import com.Sportify.Views.JSONViews.payment.PaymentMethodView;
import com.Sportify.Views.JSONViews.event.EventView;
import com.Sportify.Views.JSONViews.user.SubscriptionView;
import com.Sportify.Views.JSONViews.user.UserView;
import com.fasterxml.jackson.annotation.JsonView;
import org.orm.PersistentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @JsonView(UserView.Public.class)
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public User getUser(@PathVariable("id") int id){
        return userService.getUser(id);
    }

    @JsonView(UserView.Public.class)
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public int registerUser(@RequestBody User user){
        try {
            return userService.registerUser(user);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    @RequestMapping(value = "/{id}/options", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void changeOptions(@PathVariable("id") int id, @RequestBody User user){
        try {
            userService.changeOptions(id, user);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
    }

    @JsonView(EventCategoryView.Public.class)
    @RequestMapping(value = "/{idU}/subscriptions/{idS}/events", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<EventCategory> getSEEventCategories(@PathVariable("idU") int userID, @PathVariable("idS") int subscriptionEntityID){
        return userService.getSEEventCategories(userID, subscriptionEntityID);
    }

    @JsonView(SubscriptionView.Public.class)
    @RequestMapping(value = "/{id}/subscriptions", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Subscription> getSubscriptions(@PathVariable("id") int id){
        return userService.getSubscriptions(id);
    }

    @JsonView(UserView.Public.class)
    @RequestMapping(value = "/login", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public User login(@RequestBody User user) {
        return userService.login(user);
    }

    @RequestMapping(value = "/{idU}/subscribe/{idSE}", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void subscribe(@PathVariable("idU") int id, @PathVariable("idSE") int idSE, @RequestBody Subscription subscription){
        try {
            userService.subscribe(id, idSE, subscription);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
    }

    @JsonView(PaymentMethodView.Public.class)
    @RequestMapping(value = "/{idU}/payments", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public PaymentMethod getPaymentMethod(@PathVariable("idU") int id){
        return userService.getPaymentMethod(id);
    }

    @JsonView(InvoiceView.Private.class)
    @RequestMapping(value = "/{idU}/payments", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Invoice payService(@PathVariable("idU") int id) {
        try {
            return userService.payService(id);
        } catch (PersistentException e) {
            e.printStackTrace();
            return null;
        }
    }

    @JsonView(EventView.Public.class)
    @RequestMapping(value = "/{idU}/notifications", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Event> getNotifications(@PathVariable("idU") int id){
        return userService.consultNotifications(id);
    }

    @JsonView(EventView.Public.class)
    @RequestMapping(value = "/{idU}/notifications/sports/{idS}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Event> getNotificationsBySport(@PathVariable("idU") int idU, @PathVariable("idS") int idS){
        return userService.consultNotificationsBySport(idU, idS);
    }

    @JsonView(SubscriptionView.Public.class)
    @RequestMapping(value = "/{idU}/subscriptions/sports/{idS}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Subscription> getSubscriptionsBySport(@PathVariable("idU") int idU, @PathVariable("idS") int idS){
        return userService.consultSubscriptionsBySport(idU, idS);
    }
}
