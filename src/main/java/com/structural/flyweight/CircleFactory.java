package com.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CircleFactory {

    private Map<String, Circle> map;

    public CircleFactory() {
        map = new HashMap<>();
    }

    public Circle getCircle(String color) {
        if(map.containsKey(color)) {
            return map.get(color);
        }

        System.out.println("Creating circle of color: " + color);
        Circle circle = new Circle(color);
        map.put(color, circle);
        return circle;
    }
}
