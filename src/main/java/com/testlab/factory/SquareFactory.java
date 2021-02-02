package com.testlab.factory;

import com.testlab.shape.Color;
import com.testlab.shape.Shape;

import static com.testlab.shape.impl.Square.SquareBuilder.aSquare;

public class SquareFactory extends AbstractShapeFactory {
    @Override
    protected Shape createShape() {
        return aSquare()
                .withColor(Color.randomColor())
                .withSide(getRandom().nextDouble())
                .build();
    }
}
