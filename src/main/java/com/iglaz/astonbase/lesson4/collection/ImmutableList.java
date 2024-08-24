package com.iglaz.astonbase.lesson4.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImmutableList {
    public static void main(String[] args) {
        List<String> integers1 = Arrays.asList("one", "two", "three");
        integers1.remove(0);

        List<String> integers2 = Arrays.asList("one", "two", "three");
        integers2.set(0, "fore");

        List<String> integers3 = List.of("one", "two", "three");
        integers3.add("five");

        List<String> integers4 = List.of("one", "two", "three");
        integers4.set(0, "fore");
    }
}
