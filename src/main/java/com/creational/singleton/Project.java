package com.creational.singleton;

public class Project {

    private String name;
    private String company;

    public Project(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public void logDetails() {
        Logger logger = Logger.getInstance();
        logger.logMessage("Project: " + name + ", " + "Company: " + company);
    }
}
