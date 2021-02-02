package com.testlab.shape.impl;

import com.testlab.shape.Color;

public class Trapezoid extends AbstractFigure {

    private double sideA;
    private double sideB;
    private double height;

    public Trapezoid(Color color, double sideA, double sideB, double height) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (sideA + sideB) * height;
    }

    @Override
    public String print() {
        return "Фигура: трапеция, " +
                "площадь: " +
                getArea() +
                "кв. ед.,  цвет " +
                getColor().getName();
    }

    public static final class TrapezoidBuilder {

        private double sideA;
        private double sideB;
        private double height;
        private Color color;

        public TrapezoidBuilder() {
        }

        public static TrapezoidBuilder aTrapezoid() {
            return new TrapezoidBuilder();
        }

        public TrapezoidBuilder withSideA(double sideA) {
            this.sideA = sideA;
            return this;
        }

        public TrapezoidBuilder withSideB(double sideB) {
            this.sideB = sideB;
            return this;
        }

        public TrapezoidBuilder withHeight(double height) {
            this.height = height;
            return this;
        }

        public TrapezoidBuilder withColor(Color color) {
            this.color = color;
            return this;
        }


        public Trapezoid build() {
            return new Trapezoid(color, sideA, sideB, height);
        }
    }
}

