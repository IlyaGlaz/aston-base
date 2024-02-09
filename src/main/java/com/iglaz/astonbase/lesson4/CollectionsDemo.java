package com.iglaz.astonbase.lesson4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<String> string1 = List.of("String", "String2", "Strint3");

        List<String> list2 = Arrays.asList("String", "String2");

        List<String> someList3 = new LinkedList<>(string1);

        someList3.get(3);

        int[] numbers = {2, 34, 434};
    }

    //    static <T extends Comparable<? super T>> void sort(List<T> list) {
    //
    //    }
}
