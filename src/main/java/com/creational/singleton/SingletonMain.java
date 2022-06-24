package com.creational.singleton;

public class SingletonMain {

    public static void main(String[] args) {

        Project project = new Project("Mission", "Spacer");
        project.logDetails();

        Task task = new Task("Create a Design", "Pavan", "Neil");
        task.logDetails();

        project.logDetails();
        task.logDetails();

        project.logDetails();
        project.logDetails();
    }

}
