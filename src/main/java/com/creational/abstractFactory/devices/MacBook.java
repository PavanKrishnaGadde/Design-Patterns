package com.creational.abstractFactory.devices;

public class MacBook implements Device {
    @Override
    public void display() {
        System.out.println("Hello user, Macbook booting up!");
    }
}
