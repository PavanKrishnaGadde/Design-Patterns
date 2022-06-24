package com.behavioural.strategy;

public class StrategyMain {

    public static void main(String[] args) {

        Vehicle car = new Car();
        TravelBooking tb = new TravelBooking(1001,"hyd","blr", car);
        tb.travel();

        Vehicle plane = new Plane();
        TravelBooking tb2 = new TravelBooking(1002,"blr","mum", plane);
        tb2.travel();

        Vehicle lorry = new Lorry();
        tb2.setVehicle(lorry);
        tb2.travel();

    }
}
