package com.behavioural.visitor;

public interface Visitor {
    double visit(ElectronicItem electronicItem);
    double visit(FurnitureItem furnitureItem);
    double visit(FoodItem foodItem);
}
