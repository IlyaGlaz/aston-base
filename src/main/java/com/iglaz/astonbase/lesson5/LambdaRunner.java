package com.iglaz.astonbase.lesson5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaRunner {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(44, 22, 55);

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };

        Comparator<Integer> comparator1 = (Integer o1, Integer o2) -> {
                return Integer.compare(o1, o2);
        };

        Comparator<Integer> comparator2 = (o1, o2) -> Integer.compare(o1, o2);

        Comparator<Integer> comparator3 = Integer::compare;

        Collections.sort(list, comparator1);
    }

//    static class IntegerComparator implements Comparator<Integer> {
//
//        @Override
//        public int compare(Integer o1, Integer o2) {
//            return Integer.compare(o1, o2);
//        }
//    }
}
