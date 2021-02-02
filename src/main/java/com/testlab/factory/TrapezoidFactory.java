package com.testlab.factory;

import com.testlab.shape.Color;
import com.testlab.shape.Shape;

import static com.testlab.shape.impl.Trapezoid.TrapezoidBuilder.aTrapezoid;

public class TrapezoidFactory extends AbstractShapeFactory {
    @Override
    protected Shape createShape() {
        return aTrapezoid()
                .withColor(Color.randomColor())
                .withSideA(getRandom().nextDouble())
                .withSideB(getRandom().nextDouble())
                .withHeight(getRandom().nextDouble())
                .build();
    }
}
