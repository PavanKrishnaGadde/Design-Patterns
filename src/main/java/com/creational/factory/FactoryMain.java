package com.creational.factory;

public class FactoryMain {

    public static void main(String args[]) {

        OSFactory factory = new OSFactory();
        OS os = factory.getInstance("secured");
        os.display();
    }
}
