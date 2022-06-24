package com.creational.abstractFactory;

public class FactoryProvider {
    AbstractFactory getFactory(String deviceType) {
        if (deviceType.equalsIgnoreCase("Mobile")) {
            return new MobilePhoneFactory();
        }
        if(deviceType.equalsIgnoreCase("Laptop")) {
            return new LaptopFactory();
        }
        System.out.println("Invalid Device Type");
        return null;
    }
}
