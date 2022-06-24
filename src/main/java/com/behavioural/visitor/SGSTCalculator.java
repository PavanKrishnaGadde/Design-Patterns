package com.behavioural.visitor;

public class SGSTCalculator implements Visitor{
    @Override
    public double visit(ElectronicItem electronicItem) {
        return electronicItem.getPrice() * 0.22;
    }

    @Override
    public double visit(FurnitureItem furnitureItem) {
        return furnitureItem.isOfficeUse() ? furnitureItem.getPrice() * 0.15 : furnitureItem.getPrice() * 0.21;
    }

    @Override
    public double visit(FoodItem foodItem) {
        return foodItem.getPrice() * 0.17 - foodItem.getServiceCharge() * 0.00;
    }
}