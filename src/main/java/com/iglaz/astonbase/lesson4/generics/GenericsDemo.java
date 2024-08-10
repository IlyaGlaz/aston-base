package com.iglaz.astonbase.lesson4.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsDemo {
    public static void main(String[] args) {
//        AnyList anyList = new AnyList(10);
//
//        anyList.add("String");
//        anyList.add(22);
//
//        Object o = anyList.get(1);
//        if (o instanceof String) {
//            String o2 = (String) o;
//            o2.length();
//        }

//        anyList.add(22);

//        GenList<Integer> intList = new GenList<>(22);
//        intList.add(22);
//
//        Integer i = intList.get(0);
//        i.byteValue();
//
//        putList(intList);

        List<Integer> str2 = new ArrayList<>(Arrays.asList(22, 2234, 234));

        List<Integer> str = List.of(233, 23, 234, 234, 234, 234, 234, 234, 234, 234, 2342, 234, 234);

        List<Integer> list = Arrays.asList(22, 2234, 234);
        list.set(1, 44);

        ArrayList<String> strings = new ArrayList<>();
        strings.trimToSize();
    }

    static void putList(GenList<? extends Number> list) {

    }
}
