package com.testlab.factory;

import com.testlab.shape.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class AbstractShapeFactory implements ShapeFactory {

    protected static Random getRandom() {
        return new Random();
    }

    @Override
    public List<Shape> createFigureList() {
        Random random = getRandom();
        int randomSize = random.nextInt(10) + 1;
        List<Shape> result = new ArrayList<>(randomSize);
        for (int i = 0; i <= randomSize; i++) {
            result.add(createShape());
        }
        return result;
    }

    protected abstract Shape createShape();

}

