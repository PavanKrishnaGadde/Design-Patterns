package com.structural.bridge;

import com.structural.bridge.color.Color;
import com.structural.bridge.shape.Shape;

public class ColouredShape extends AbstractShape{
    public ColouredShape(Color color, Shape shape) {
        super(color, shape);
    }

    @Override
    void displayDetails() {
        this.displayShape();
        this.displayColor();
    }
}
