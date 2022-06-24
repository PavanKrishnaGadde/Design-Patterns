package com.behavioural.observer;


public class Publisher {
    String name;

    public Publisher(String name) {
        this.name = name;
    }

    public void publish(Channel channel, String videoName) {
        channel.publish(this, videoName);
    }
}
