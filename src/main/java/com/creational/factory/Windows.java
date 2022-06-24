package com.creational.factory;

public class Windows implements OS{
    @Override
    public void display() {
        System.out.println("This is an windows phone");
    }
}