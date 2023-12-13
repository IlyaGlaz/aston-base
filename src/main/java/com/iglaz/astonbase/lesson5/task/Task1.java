package com.iglaz.astonbase.lesson5.task;

import com.iglaz.astonbase.lesson5.Dish;

import java.util.ArrayList;
import java.util.List;

/**
 * Какой из потоковых операций вы бы воспользовались для рефакторинга следующего кода?
 */
public class Task1 {
    public static void main(String[] args) {
        List<String> highCaloricDishes = new ArrayList<>();
        for (Dish dish : Dish.menu) {
            if (dish.getCalories() > 300) {
                highCaloricDishes.add(dish.getName());
            }
        }
    }
}
