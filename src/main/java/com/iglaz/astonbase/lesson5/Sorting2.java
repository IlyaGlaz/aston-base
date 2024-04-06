package com.iglaz.astonbase.lesson5;

import com.iglaz.astonbase.lesson3.copy.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Sorting2 {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(new Person("Ivan", 99),
                new Person("Petor", 24),
                new Person("Alan", 12)
                );

//        Person ivan = new Person("ivan", 4);
//        Person ivan2=  new Person("ivan", 4);
//
//        ivan.compareTo(ivan2);

        Collections.sort(list, (o1, o2) -> o1.getName().compareTo(o2.getName()));

        System.out.println(list);

        Map<Person, Integer> treaMap = new TreeMap<>((o1, o2) -> o1.getName().compareTo(o2.getName()));



//        Integer[] number = {12, 23 ,43};
//        List<Integer> integers = List.of(123, 42, 24);
//        List<Integer> list1 = Arrays.asList(number);
//
//        Map<Integer, String> string2 = Map.ofEntries(Map.entry(22, "Hello"));
//
//        Map<String, Integer> treeMap = new TreeMap<>(Map.of("zz", 22,
//                "aaaa", 22,
//                "ccc", 777));

//        System.out.println(treeMap);;
    }
}
