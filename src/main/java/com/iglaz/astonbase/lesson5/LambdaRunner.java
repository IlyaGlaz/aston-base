package com.iglaz.astonbase.lesson5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaRunner {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(44, 22, 55);

        Comparator<Integer> comparator = (Integer i1, Integer i2) -> {
            return Integer.compare(i2, i1);
        };

//        Comparator<Integer> comparator = (Integer i1, Integer i2) -> Integer.compare(i2, i1);

//        Comparator<Integer> comparator = (i1, i2) -> Integer.compare(i2, i1);

//        Comparator<Integer> comparator = Integer::compare;

//        System.out.println(comparator.compare(22, 11));

        Collections.sort(list, comparator);

        System.out.println(list);
    }

//    static class IntegerComparator implements Comparator<Integer> {
//@Override
//
//       (Integer i1, Integer i2)  -> {
//           return Integer.compare(i2, i1);
//        }
//    }
}
