package com.behavioural.strategy;

public class TravelBooking {
    private int id;
    private String pickup;
    private String destination;
    private Vehicle vehicle;

    public TravelBooking(int id, String pickup, String destination, Vehicle vehicle) {
        this.id = id;
        this.pickup = pickup;
        this.destination = destination;
        this.vehicle = vehicle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPickup() {
        return pickup;
    }

    public void setPickup(String pickup) {
        this.pickup = pickup;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void travel() {
        vehicle.drive();
    }
}
