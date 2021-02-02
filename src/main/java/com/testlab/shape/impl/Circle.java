package com.testlab.shape.impl;

import com.testlab.shape.Color;

public class Circle extends AbstractFigure {

    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String print() {
        return "Фигура: круг, " +
                "площадь: " +
                getArea() +
                " кв. ед, цвет: " +
                getColor().getName();
    }

    public static final class CircleBuilder {

        private double radius;
        private Color color;

        public CircleBuilder() {
        }

        public static CircleBuilder aCircle() {
            return new CircleBuilder();
        }

        public CircleBuilder withRadius(double radius) {
            this.radius = radius;
            return this;
        }

        public CircleBuilder withColor(Color color) {
            this.color = color;
            return this;
        }

        public Circle build() {
            return new Circle(color, radius);
        }
    }
}