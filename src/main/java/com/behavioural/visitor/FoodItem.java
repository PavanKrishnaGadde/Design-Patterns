package com.behavioural.visitor;

public class FoodItem implements SellableItem{
    private double price;
    private String itemName;
    private String GSTNumber;
    private String restaurentName;
    private double serviceCharge;

    public FoodItem(double price, String itemName, String GSTNumber, String restaurentName, double serviceCharge) {
        this.price = price;
        this.itemName = itemName;
        this.GSTNumber = GSTNumber;
        this.restaurentName = restaurentName;
        this.serviceCharge = serviceCharge;
    }

    @Override
    public double calculateTax(Visitor visitor) {
        return visitor.visit(this);
    }

    public double getPrice() {
        return price;
    }

    public double getServiceCharge() {
        return serviceCharge;
    }
}
