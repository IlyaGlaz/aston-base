package com.iglaz.astonbase.lesson5;

import com.iglaz.astonbase.lesson2.object.Client;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Sorting2 {
    public static void main(String[] args) {
        List<Client> list = Arrays.asList(new Client("Ivan", 99),
                new Client("Petor", 24),
                new Client("Alan", 12)
        );

        Client ivan = new Client("ivan", 4);
        Client ivan2 = new Client("ivan", 4);

        Collections.sort(list, (o1, o2) -> o1.getName().compareTo(o2.getName()));

        System.out.println(list);

        Map<Client, Integer> treaMap = new TreeMap<>((o1, o2) -> o1.getName().compareTo(o2.getName()));


        Integer[] number = {12, 23, 43};
        List<Integer> integers = List.of(123, 42, 24);
        List<Integer> list1 = Arrays.asList(number);

        Map<Integer, String> string2 = Map.ofEntries(Map.entry(22, "Hello"));

        Map<String, Integer> treeMap = new TreeMap<>(Map.of("zz", 22,
                "aaaa", 22,
                "ccc", 777));

        System.out.println(treeMap);
        ;
    }
}
