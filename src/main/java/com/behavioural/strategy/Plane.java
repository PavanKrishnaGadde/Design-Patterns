package com.behavioural.strategy;

public class Plane implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Travelling in a plane as i'm rich enough");
    }
}
