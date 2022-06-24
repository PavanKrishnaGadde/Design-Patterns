package com.creational.factory;

public class OSFactory {

    public OS getInstance(String type) {

        if(type.equalsIgnoreCase("secured")) return new IOS();

        if(type.equalsIgnoreCase("unsecured")) return new Windows();

        return new Android();

    }

}
