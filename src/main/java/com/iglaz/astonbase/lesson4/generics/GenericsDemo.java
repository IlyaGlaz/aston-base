package com.iglaz.astonbase.lesson4.generics;

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

        GenList<Integer> intList = new GenList<>(22);
        intList.add(22);

        Integer i = intList.get(0);
        i.byteValue();

        putList(intList);
    }

    static void putList(GenList<? extends Number> list) {

    }
}
