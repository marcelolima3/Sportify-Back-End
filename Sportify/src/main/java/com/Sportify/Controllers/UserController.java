package com.Sportify.Controllers;

import com.Sportify.Entities.event.EventCategory;
import com.Sportify.Entities.payment.PaymentMethod;
import com.Sportify.Entities.user.Subscription;
import com.Sportify.Service.UserService;
import org.orm.PersistentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/register", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public int registerUser(@RequestParam("name") String name,
                            @RequestParam("email") String email,
                            @RequestParam("password") String password,
                            @RequestBody PaymentMethod paymentMethod){
        try {
            return userService.registerUser(name,email,password,paymentMethod);
        } catch (Exception e) {
            return -1;
        }
    }

    @RequestMapping(value = "/{id}/changeOptions", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void changeOptions(@PathVariable("id") int id,
                              @RequestParam("notificationType") String notificationType,
                              @RequestParam PaymentMethod paymentMethod){
        userService.changeOptions(id, notificationType,paymentMethod);
    }

    @RequestMapping(value = "/{idU}/subscriptions/{idS}/events", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<EventCategory> getSEEventCategories(@PathVariable("idU") int userID, @PathVariable("idS") int subscriptionEntityID){
        return userService.getSEEventCategories(userID, subscriptionEntityID);
    }

    @RequestMapping(value = "/{id}/subscriptions", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Subscription> getSubscriptions(@PathVariable("id") int id){
        return userService.getSubscriptions(id);
    }
}
