package com.testlab.shape.impl;

import com.testlab.shape.Color;

public class Square extends AbstractFigure {

    private double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public String print() {
        return "Фигура: квадрат, площадь: " +
                getArea() +
                " кв. ед., " +
                "длина стороны: " +
                side +
                " ед., " +
                "цвет: " +
                getColor().getName();
    }

    public static final class SquareBuilder {

        private double side;
        private Color color;

        public SquareBuilder() {
        }

        public static SquareBuilder aSquare() {
            return new SquareBuilder();
        }

        public SquareBuilder withSide(double side) {
            this.side = side;
            return this;
        }

        public SquareBuilder withColor(Color color) {
            this.color = color;
            return this;
        }

        public Square build() {
            return new Square(color, side);
        }
    }
}
