package com.testlab.factory;

import com.testlab.shape.Color;
import com.testlab.shape.Shape;

import static com.testlab.shape.impl.Circle.CircleBuilder.aCircle;

public class CircleFactory extends AbstractShapeFactory {

    @Override
    protected Shape createShape() {

        return aCircle()
                .withColor(Color.randomColor())
                .withRadius(getRandom().nextDouble())
                .build();
    }
}
