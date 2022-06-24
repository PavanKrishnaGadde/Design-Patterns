package com.behavioural.iterator;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

public class MessagingAppNotifications implements Collection {

    private List<Notification> notifications;

    public MessagingAppNotifications() {
        notifications = new ArrayList<>();
    }

    public void addNotification(Notification notification) {
        notifications.add(notification);
    }


    @Override
    public Iterator createIterator() {
        return new ListIterator<Notification>(notifications);
    }
}
