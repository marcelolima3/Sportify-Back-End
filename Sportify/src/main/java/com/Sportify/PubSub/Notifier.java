package com.Sportify.PubSub;

import java.util.Collections;
import com.pusher.rest.Pusher;

public class Notifier {
    private Pusher pusher;

    public Notifier() {
        // TODO Remove credentials here and put as environment vars
        this.pusher = new Pusher("552416", "1d3b137c219c83de17e0", "e0ea31c9033b036e0b79");
        this.pusher.setCluster("eu");
        this.pusher.setEncrypted(true);
    }

    public void sendMessage(String channel, String title, String content){
        pusher.trigger(channel, "my-event", new Notification(title, content));

    }
}
