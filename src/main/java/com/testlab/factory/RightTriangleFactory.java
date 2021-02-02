package com.testlab.factory;

import com.testlab.shape.Color;
import com.testlab.shape.Shape;

import static com.testlab.shape.impl.RightTriangle.RightTriangleBuilder.aRightTriangle;

public class RightTriangleFactory extends AbstractShapeFactory {
    @Override
    protected Shape createShape() {
        return aRightTriangle().
                withColor(Color.randomColor())
                .withSideA(getRandom().nextDouble())
                .withSideB(getRandom().nextDouble())
                .build();
    }
}
