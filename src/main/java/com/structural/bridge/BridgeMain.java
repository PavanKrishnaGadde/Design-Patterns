package com.structural.bridge;

import com.structural.bridge.color.Color;
import com.structural.bridge.color.Green;
import com.structural.bridge.color.Red;
import com.structural.bridge.shape.Circle;
import com.structural.bridge.shape.Shape;
import com.structural.bridge.shape.Square;

public class BridgeMain {
    public static void main(String[] args) {
        Color color = new Green();
        Shape shape = new Square();

        ColouredShape cs = new ColouredShape(color, shape);
        cs.displayDetails();

        Color color2 = new Red();
        Shape shape2 = new Circle();

        ColouredShape cs2 = new ColouredShape(color2, shape2);
        cs2.displayDetails();

        Color color3 = new Red();
        Shape shape3 = new Square();

        ColouredShape cs3 = new ColouredShape(color3, shape3);
        cs3.displayDetails();
    }
}
