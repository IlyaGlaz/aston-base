package com.iglaz.astonbase.lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Anonimus {
    public static void main(String[] args) {
        class MyComparator implements Comparator<Integer> {

            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        }

        List<Integer> list = Arrays.asList(2, 4, 44, 66);
        Collections.sort(list,

                new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });

        LinkedList<String> strings = new LinkedList<>();
        strings.get(10);

    }
}
