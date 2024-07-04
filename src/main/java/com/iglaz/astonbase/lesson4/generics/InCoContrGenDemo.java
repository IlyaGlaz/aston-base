package com.iglaz.astonbase.lesson4.generics;

import java.util.ArrayList;
import java.util.List;

public class InCoContrGenDemo {
    public static void main(String[] args) {
        Integer integer = 22;
        Number num = 2424;
        num = integer;

        // Ковариантность
        String[] strArray =  new String[0];
        Object[] objArray =  strArray;
        objArray = strArray;

        // Ковариантность List
        List<Double> intList = new ArrayList<>();
        List<? extends Number> numList = new ArrayList<>();
        numList = intList;

        for (Number d : numList) {
            System.out.println(d.longValue());
        }

        // Контравариантность List
//        List<Number> numList2 = new ArrayList<>();
        List<Object> objList2 = new ArrayList<>();
        List<? super Number> numList3 = objList2;

        // Инвариантность
        List<String> strList = new ArrayList<>();
        List<String> objList = new ArrayList<>();
        objList = strList;
//
//        PECS

//        List<Object> integer = List.of(new Object());
        List<Number> numbers = new ArrayList<>();



        someTest(new ArrayList<Double>());
    }

    static void someTest(List<? extends Number> list) {
        System.out.println();
    }
}
