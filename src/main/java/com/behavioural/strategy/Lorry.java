package com.behavioural.strategy;

public class Lorry implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Travelling in lorry as there are no other options");
    }
}
