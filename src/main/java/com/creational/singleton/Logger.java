package com.creational.singleton;

public class Logger {
    private static Logger instance = null;
    private static int messageId = 0;

    private Logger() {}

    public static Logger getInstance() {
        if(instance == null) {
            instance = new Logger();
            messageId = 0;
        }
        return instance;
    }

    public void logMessage(String message) {
        System.out.println(messageId + ": " + message);
        messageId++;
    }
}
