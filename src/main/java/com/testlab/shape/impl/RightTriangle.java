package com.testlab.shape.impl;

import com.testlab.shape.Color;

public class RightTriangle extends AbstractFigure {

    private double sideA;
    private double sideB;

    public RightTriangle(Color color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;

    }

    private double getHypotenuse() {
        return Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
    }

    @Override
    public double getArea() {
        return 0.5 * sideA * sideB;
    }


    @Override
    public String print() {
        return "Фигура: треугольник, " +
                "площадь: " +
                getArea() +
                "кв. ед., " +
                "гипотенуза: " +
                getHypotenuse() +
                " ед., цвет: " +
                getColor().getName();
    }

    public static final class RightTriangleBuilder {

        private double sideA;
        private double sideB;
        private Color color;

        public RightTriangleBuilder() {
        }

        public static RightTriangleBuilder aRightTriangle() {
            return new RightTriangleBuilder();
        }

        public RightTriangleBuilder withSideA(double sideA) {
            this.sideA = sideA;
            return this;
        }

        public RightTriangleBuilder withSideB(double sideB) {
            this.sideB = sideB;
            return this;
        }

        public RightTriangleBuilder withColor(Color color) {
            this.color = color;
            return this;
        }

        public RightTriangle build() {
            return new RightTriangle(color, sideA, sideB);
        }
    }
}
