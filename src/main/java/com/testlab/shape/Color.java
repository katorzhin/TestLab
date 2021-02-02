package com.testlab.shape;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Color {

    RED("красный"),
    ORANGE("оранжевый"),
    YELLOW("желтый"),
    GREEN("зеленный"),
    BLUE("голубой"),
    DARK_BLUE("синий"),
    PURPLE("фиолетовый");

    private static final List<Color> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    private String name;

    Color(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Color randomColor() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }

}
