package com.iglaz.astonbase.lesson5.stream;

import com.iglaz.astonbase.lesson5.Dish;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

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

//        getLowCaloricDishesNamesInJava7(dishes).forEach(System.out::println);

//         Java 8
//        getLowCaloricDishesNamesInJava8(dishes).forEach(System.out::println);

        Stream.of("zzz", "ffff", "aaaa")
                .peek(s -> System.out.println(s))
                .forEach(s -> System.out.println(s));
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
        Predicate<Dish> pred = dish -> {
            System.out.println(dish);
            return dish.getCalories() < 300;
        };

       dishes.stream()
                .filter(dish -> dish.getCalories() < 300)
                .sorted((d1, d2) -> d1.getCalories() - d2.getCalories())
                .flatMap(dish -> dish.getIngredients().stream())
                .forEach(name -> System.out.println(name));

        return Collections.emptyList();
    }

    static class MyPredicate implements Predicate<Dish> {

        @Override
        public boolean test(Dish dish) {
            return dish.getCalories() < 100;
        }

    }
}















