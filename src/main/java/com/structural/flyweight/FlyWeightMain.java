package com.structural.flyweight;

public class FlyWeightMain {
    public static void main(String[] args) {
        final String[] colors = {"Blue", "Red", "Green", "Orange", "Yellow", "Pink"};

        CircleFactory factory = new CircleFactory();

        for(int i=0;i<30;i++) {
            Circle circle = factory.getCircle(getRandColor(colors));

            circle.setX(getRandX());
            circle.setY(getRandY());
            circle.setRadius(20);
            circle.draw();
        }

    }

    public static String getRandColor(String[] colors) {
        return colors[(int)(Math.random()*colors.length)];
    }

    public static int getRandX() {
        return (int)(Math.random()*100);
    }

    public static int getRandY() {
        return (int)(Math.random()*100);
    }
}
