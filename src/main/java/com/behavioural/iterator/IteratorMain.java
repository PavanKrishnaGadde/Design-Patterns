package com.behavioural.iterator;

public class IteratorMain {

    public static void main(String[] args) {

        FoodAppNotifications fn = new FoodAppNotifications();
        fn.addNotification(new Notification(1, "Your Order is on the way", "Zomato"));
        fn.addNotification(new Notification(2, "Delivery agent has picked up the order", "Zomato"));
        fn.addNotification(new Notification(3, "Order food and get 10% discount", "Swiggy"));
        fn.addNotification(new Notification(4, "We started our services in your area", "Dunzo"));

        MessagingAppNotifications ms = new MessagingAppNotifications();
        ms.addNotification(new Notification(11, "Mark: Hellooo", "Facebook"));
        ms.addNotification(new Notification(12, "Jhon: Are you interested in this oppurtunity?", "LinkedIn"));
        ms.addNotification(new Notification(13, "Modi: Are you attending the conference?", "Twitter"));
        ms.addNotification(new Notification(14, "Elon: How are the new features?", "Twitter"));

        NotificationsManager manager = new NotificationsManager();

        manager.addNotificationApp(fn);
        manager.addNotificationApp(ms);

        manager.displayNotifications();
    }
}
