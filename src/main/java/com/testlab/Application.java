package com.testlab;

import com.testlab.factory.*;
import com.testlab.shape.Shape;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.isNull;

public class Application {

    private List<ShapeFactory> factories;

    private void configure() {
        factories = new ArrayList<>();
        factories.add(new CircleFactory());
        factories.add(new RightTriangleFactory());
        factories.add(new SquareFactory());
        factories.add(new TrapezoidFactory());
    }

    public void run() {
        if (isNull(factories)) {
            configure();
        }
        List<Shape> shapes = new ArrayList<>();

        for (ShapeFactory factory : factories) {
            shapes.addAll(factory.createFigureList());
        }
        for (Shape shape : shapes) {
            System.out.println(shape.print());
        }

    }
}
