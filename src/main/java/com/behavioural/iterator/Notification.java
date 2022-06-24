package com.behavioural.iterator;

public class Notification {
    private int id;
    private String message;
    private String appName;

    public Notification(int id, String message, String appName) {
        this.id = id;
        this.message = message;
        this.appName = appName;
    }

    public int getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public String getAppName() {
        return appName;
    }
}
