package com.iglaz.astonbase.lesson5;

import com.iglaz.astonbase.lesson3.copy.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Sorting {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(new Person("Ivan", 22), new Person("Petor", 24));

        Collections.sort(list, (o1, o2) ->  o2.getAge().compareTo(o1.getAge()));

        Integer[] number = {12, 23 ,43};
        List<Integer> integers = List.of(123, 42, 24);
        List<Integer> list1 = Arrays.asList(number);

        Map<Integer, String> string2 = Map.ofEntries(Map.entry(22, "Hello"));

        Map<String, Integer> treeMap = new TreeMap<>(Map.of("zz", 22,
                "aaaa", 22,
                "ccc", 777));

        System.out.println(treeMap);;
    }
}
