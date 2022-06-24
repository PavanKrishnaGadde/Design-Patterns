package com.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    String name;
    List<Subscriber> subs;

    public Channel(String name) {
        this.name = name;
        this.subs = new ArrayList<>();
    }

    @Override
    public void subscribe(Subscriber sub) {
        subs.add(sub);
    }

    @Override
    public void unsubscribe(Subscriber sub) {
        subs.remove(sub);
    }

    @Override
    public void publish(Publisher pub, String videoName) {
        for(Subscriber sub: subs) {
            sub.update(pub.name, videoName);
        }
    }

}
