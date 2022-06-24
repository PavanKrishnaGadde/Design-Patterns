package com.behavioural.observer;

public class Subscriber implements Observer {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String channelName, String videoName) {
        System.out.println("Hey " + name + ", " + channelName + " published " + videoName);
    }
}
