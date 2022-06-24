package com.structural.composite;

public class SimpleItem implements Item {
    int price;
    String name;

    public SimpleItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void print() {
        System.out.println(name + ": " + price);
    }

    @Override
    public int getPrice() {
        print();
        return this.price;
    }
}
