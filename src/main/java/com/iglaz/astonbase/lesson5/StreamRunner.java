package com.iglaz.astonbase.lesson5;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamRunner {
    public static void main(String[] args) {
        Stream.of("Hello", "My name");
        List<Integer> integers = List.of(22, 44, 44,  145, 250);

        List<String> strings = List.of("Ivan", "Alice", "Alice", "Bilbo", "Frodo");

//        strings.stream()
//                .skip(2)
//                .forEach(System.out::println);

//        List<Dish> menu = Dish.menu;
//        List<Boolean> collect = menu.stream()
//                .map(dish -> dish.isVegetarian())
//                .toList();
        // 1.Фильтарция
        // 2.Преобразование объекта Dish в String
        // 3.Добавить элементы в List
        List<Dish> menu = Dish.menu;

        List<String> collect = menu.stream()
                .filter((Dish dish) -> dish.getCalories() < 400)
                .map((Dish dish) -> dish.getName())
                .sorted()
                .collect(Collectors.toList());

        // Optional
        Optional<Integer> optional = menu.stream()
                .filter((Dish dish) -> dish.getCalories() < 400)
                .map(dish -> dish.getCalories())
                .reduce(Integer::sum);

        System.out.println(optional.get());

//        System.out.println(optional.orElseThrow(() -> new UserNotFoundException()));
//        System.out.println(optional.isPresent());
//        System.out.println(optional.get());
//
//        optional.ifPresent(integer -> System.out.println(integer));
    }


}
