package com.structural.flyweight;

public class Circle {
    private String color;

    private int X;
    private int Y;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setX(int x) {
        X = x;
    }

    public void setY(int y) {
        Y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing " + color + " circle of radius " + radius + " with center as [ " + X + " , " + Y + " ]");
    }
}
