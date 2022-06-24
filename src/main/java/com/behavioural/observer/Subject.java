package com.behavioural.observer;

public interface Subject {
    void subscribe(Subscriber sub);

    void unsubscribe(Subscriber sub);

    void publish(Publisher pub, String videoName);
}
