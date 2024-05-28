package com.iglaz.astonbase.lesson5;

import java.util.Arrays;
import java.util.List;

public class StreamRunner1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(22, 244, 2432);

        List<String> list = numbers.stream()
                .filter((Integer integer) -> {
                            return integer > 50;
                        }
                )
                .map(integer -> String.valueOf(integer))
                .toList();
    }
}
