package com.iglaz.astonbase.lesson5.stream;

import com.iglaz.astonbase.lesson5.Dish;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class StreamBasic {
    public static void main(String... args) {

        List<Dish> dishes = List.of(
                new Dish("french fries", true, 550, Dish.Type.OTHER),
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 350, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 500, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 400, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH)
        );

        getLowCaloricDishesNamesInJava7(dishes).forEach(System.out::println);

        // Java 8
//        getLowCaloricDishesNamesInJava8(dishes).forEach(System.out::println);
    }

    public static List<String> getLowCaloricDishesNamesInJava7(List<Dish> dishes) {
        List<Dish> lowCaloricDishes = new ArrayList<>();

        for (Dish d : dishes) {
            if (d.getCalories() < 400) {
                lowCaloricDishes.add(d);
            }
        }

        //===========================================================================

        Collections.sort(lowCaloricDishes, new Comparator<Dish>() {
            @Override
            public int compare(Dish d1, Dish d2) {
                return Integer.compare(d1.getCalories(), d2.getCalories());
            }
        });

        //===========================================================================

        List<String> lowCaloricDishesName = new ArrayList<>();

        for (Dish d : lowCaloricDishes) {
            lowCaloricDishesName.add(d.getName());
        }
        return lowCaloricDishesName;
    }

    public static List<String> getLowCaloricDishesNamesInJava8(List<Dish> dishes) {
        dishes.stream()
                .filter(dish -> dish.getCalories() < 400)
                .flatMap(d -> d.getIngredients().stream())
                .forEach(System.out::println);

        return Collections.emptyList();
    }

    static public boolean some(Dish dish) {
        return true;
    }

    static class MyPredicate implements Predicate<Dish> {

        @Override
        public boolean test(Dish dish) {
            return dish.getCalories() < 400;
        }
    }
}















