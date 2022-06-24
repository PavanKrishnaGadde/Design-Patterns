package com.behavioural.iterator;

import java.util.ArrayList;
import java.util.List;

public class NotificationsManager {
    List<Collection> notificationApps;

    public NotificationsManager() {
        notificationApps = new ArrayList<>();
    }

    public void addNotificationApp(Collection notificationApp) {
        notificationApps.add(notificationApp);
    }

    public void displayNotifications() {
        for(Collection notificationApp : notificationApps) {
            Iterator<Notification> it = notificationApp.createIterator();

            while (it.hasNext()) {
                Notification notification = it.next();
                System.out.println(notification.getAppName() + " [" + notification.getId() + "] : " + notification.getMessage());
            }
        }
    }

}
