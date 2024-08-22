package com.iglaz.astonbase.lesson4.generics;

import com.iglaz.astonbase.lesson2.object.Client;

import java.util.ArrayList;

public class GenericsDemo {
    public static void main(String[] args) {
//        AnyList anyList = new AnyList(10);
//
//        anyList.add("String");
//        anyList.add(22);
//        anyList.add(22);
//
//        String str = (String) anyList.get(1);

        GenList<String> intList = new GenList<>(22);
        GenList.addOtherElement(new Client("Inva", 22));

        Object num = Integer.valueOf(22);
        putSingel(22L);

        putArr(new Integer[] {});

        ArrayList<Number> numbers = new ArrayList<>(new ArrayList<Integer>());

    }

    // Инварианты
    static void putList(GenList<Number> list) {

    }

    // Коварианты
    static void putArr(Number[] arr) {

    }

    static void putSingel(Number num) {

    }
}
