package com.structural.bridge;

import com.structural.bridge.color.Color;
import com.structural.bridge.shape.Shape;

public abstract class AbstractShape {
    private Color color;
    private Shape shape;

    public AbstractShape(Color color, Shape shape) {
        this.color = color;
        this.shape = shape;
    }

    protected void displayShape() {
        shape.display();
    }

    protected void displayColor() {
        color.sketch();
    }

    abstract void displayDetails();

}
