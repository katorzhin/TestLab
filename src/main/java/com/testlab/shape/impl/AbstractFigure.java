package com.testlab.shape.impl;

import com.testlab.shape.Color;
import com.testlab.shape.Shape;

public abstract class AbstractFigure implements Shape {

    private Color color;

    public AbstractFigure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public abstract double getArea();
}
