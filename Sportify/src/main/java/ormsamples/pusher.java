package ormsamples;

import com.pusher.rest.Pusher;

import java.util.Collections;

public class pusher {
    public static void main (String args[]){
        Pusher pusher = new Pusher("552416", "1d3b137c219c83de17e0", "e0ea31c9033b036e0b79");
        pusher.setCluster("eu");
        pusher.setEncrypted(true);

        pusher.trigger("my-channel", "my-event", Collections.singletonMap("message", "hello world"));

    }
}
