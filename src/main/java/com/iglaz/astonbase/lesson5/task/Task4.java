package com.iglaz.astonbase.lesson5.task;

import com.iglaz.astonbase.lesson5.Dish;

import java.util.Arrays;

/**
 * Как бы вы подсчитали число блюд в потоке данных с помощью методов map и reduce?
 */
public class Task4 {
    public static void main(String[] args) {
        Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 400, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH)
        );
    }
}
