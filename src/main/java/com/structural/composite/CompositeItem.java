package com.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeItem implements Item {

    String name;
    List<Item> items;

    public CompositeItem(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    public void setItem(Item item) {
        items.add(item);
    }

    public void print(int price) {
        System.out.println("----------");
        System.out.println("CCC  " + name + ": " + price);
    }


    @Override
    public int getPrice() {
        int total = 0;
        for(Item item: items) total += item.getPrice();
        print(total);
        return total;
    }
}
