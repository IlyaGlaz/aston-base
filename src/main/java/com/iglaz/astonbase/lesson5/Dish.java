package com.iglaz.astonbase.lesson5;

import java.util.Arrays;
import java.util.List;

public class Dish {

    private final String name;
    private final boolean vegetarian;
    private final Integer calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, Integer calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public Integer getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    public enum Type {
        MEAT,
        FISH,
        OTHER
    }

    @Override
    public String toString() {
        return name;
    }

    public static final List<Dish> menu = Arrays.asList(
            new Dish("french fries", true, 550, Type.OTHER),
            new Dish("pork", false, 800, Type.MEAT),
            new Dish("beef", false, 350, Type.MEAT),
            new Dish("chicken", false, 400, Type.MEAT),
            new Dish("rice", true, 350, Type.OTHER),
            new Dish("season fruit", true, 500, Type.OTHER),
            new Dish("pizza", true, 550, Type.OTHER),
            new Dish("prawns", false, 400, Type.FISH),
            new Dish("salmon", false, 450, Type.FISH)
    );
}
