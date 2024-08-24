package com.iglaz.astonbase.lesson5.stream;


import com.iglaz.astonbase.lesson5.Dish;

import java.util.Optional;

public class StreamRunner {
    public static void main(String[] args) {
        Optional<Integer> max = Dish.menu.stream()
                .map(Dish::getCalories)
                .max(Integer::compareTo);

        if (max.isPresent()) {
            max.get();
        }

        Integer i = max.orElse(0);

        Integer i1 = max.orElseThrow();

        max.ifPresent(num -> System.out.println(num));
    }
}
