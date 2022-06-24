package com.behavioural.iterator;

public class FoodAppNotifications implements Collection {

    Notification[] notifications;
    int curr;

    public FoodAppNotifications() {
        notifications = new Notification[100];
        curr = 0;
    }

    public void addNotification(Notification notification) {
        notifications[curr] = notification;
        curr++;
    }


    @Override
    public Iterator createIterator() {
        return new ArrayIterator<Notification>(notifications, curr);
    }
}
