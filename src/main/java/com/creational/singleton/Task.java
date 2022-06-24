package com.creational.singleton;

public class Task {
    private String taskName;
    private String assignee;
    private String creator;

    public Task(String taskName, String assignee, String creator) {
        this.taskName = taskName;
        this.assignee = assignee;
        this.creator = creator;
    }

    public void logDetails() {
        Logger logger = Logger.getInstance();
        logger.logMessage("Task: " + taskName + ", Created by: " + creator + ", Assigned to: " + assignee);
    }
}
