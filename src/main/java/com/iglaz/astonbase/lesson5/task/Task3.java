package com.iglaz.astonbase.lesson5.task;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 1. По заданному списку чисел вернуть список их квадратов. Например, при списке
 * [1, 2, 3, 4, 5] необходимо вернуть [1, 4, 9, 16, 25].
 */
public class Task3 {
    public static void main(String[] args) {
        System.out.println(
                Stream.of(1, 2, 3, 4, 5).map(v -> v * v).collect(Collectors.toList())
        );
    }
}
