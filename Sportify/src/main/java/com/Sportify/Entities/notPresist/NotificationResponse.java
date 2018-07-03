package com.Sportify.Entities.notPresist;

import com.Sportify.Entities.competition.Modality;
import com.Sportify.Entities.event.Event;
import com.Sportify.Entities.subentities.SubscriptionEntity;
import com.Sportify.Entities.user.Subscription;

import java.util.List;

public class NotificationResponse {

    private List<Event> event;
    private String subscriptionEntity_name;
    private String subscriptionEntity_type;
    private int subscriptionEntity_id;

    public NotificationResponse(List<Event> event, String subscriptionEntity_name, String subscriptionEntity_type, int subscriptionEntity_id) {
        this.event = event;
        this.subscriptionEntity_name = subscriptionEntity_name;
        this.subscriptionEntity_type = subscriptionEntity_type;
        this.subscriptionEntity_id = subscriptionEntity_id;
    }

    public List<Event> getEvent() {
        return event;
    }

    public void setEvent(List<Event> event) {
        this.event = event;
    }

    public String getSubscriptionEntity_name() {
        return subscriptionEntity_name;
    }

    public void setSubscriptionEntity_name(String subscriptionEntity_name) {
        this.subscriptionEntity_name = subscriptionEntity_name;
    }

    public String getSubscriptionEntity_type() {
        return subscriptionEntity_type;
    }

    public void setSubscriptionEntity_type(String subscriptionEntity_type) {
        this.subscriptionEntity_type = subscriptionEntity_type;
    }

    public int getSubscriptionEntity_id() {
        return subscriptionEntity_id;
    }

    public void setSubscriptionEntity_id(int subscriptionEntity_id) {
        this.subscriptionEntity_id = subscriptionEntity_id;
    }
}
