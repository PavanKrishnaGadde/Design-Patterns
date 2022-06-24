package com.behavioural.visitor;

public class FurnitureItem implements SellableItem{
    private double price;
    private String itemName;
    private String GSTNumber;
    private boolean isOfficeUse;

    public FurnitureItem(double price, String itemName, String GSTNumber, boolean isOfficeUse) {
        this.price = price;
        this.itemName = itemName;
        this.GSTNumber = GSTNumber;
        this.isOfficeUse = isOfficeUse;
    }

    @Override
    public double calculateTax(Visitor visitor) {
        return visitor.visit(this);
    }

    public double getPrice() {
        return price;
    }

    public boolean isOfficeUse() {
        return isOfficeUse;
    }
}

