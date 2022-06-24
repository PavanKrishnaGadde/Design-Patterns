package com.behavioural.visitor;

public class ElectronicItem implements SellableItem{
    private double price;
    private String itemName;
    private String GSTNumber;

    public double getPrice() {
        return price;
    }

    public ElectronicItem(double price, String itemName, String GSTNumber) {
        this.price = price;
        this.itemName = itemName;
        this.GSTNumber = GSTNumber;
    }

    @Override
    public double calculateTax(Visitor visitor) {
        return visitor.visit(this);
    }
}
