package com.behavioural.visitor;

public class CGSTCalculator implements Visitor{
    @Override
    public double visit(ElectronicItem electronicItem) {
        return electronicItem.getPrice() * 0.20;
    }

    @Override
    public double visit(FurnitureItem furnitureItem) {
        return furnitureItem.isOfficeUse() ? furnitureItem.getPrice() * 0.12 : furnitureItem.getPrice() * 0.18;
    }

    @Override
    public double visit(FoodItem foodItem) {
        return foodItem.getPrice() * 0.15 - foodItem.getServiceCharge() * 0.10;
    }
}
