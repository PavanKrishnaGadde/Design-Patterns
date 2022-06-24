package com.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class ShoeStore {
    String name;
    List<String> shoes;

    public ShoeStore() {
        this.shoes = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getshoes() {
        return shoes;
    }

    public void loadshoes() {
        for(int i=0;i<100;i++) {
            shoes.add("shoe" + i);
        }
    }

    @Override
    public String toString() {
        return "shoeStore{" +
                "name='" + name + '\'' +
                ", shoes=" + shoes +
                '}';
    }

}
