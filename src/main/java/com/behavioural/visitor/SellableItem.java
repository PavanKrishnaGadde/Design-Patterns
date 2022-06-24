package com.behavioural.visitor;

public interface SellableItem {
    double calculateTax(Visitor visitor);
}
