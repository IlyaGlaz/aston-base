package com.iglaz.astonbase.lesson4.generics;

import java.util.ArrayList;
import java.util.List;

public class InCoContrGenDemo {
    public static void main(String[] args) {
        Integer str1 = 22;
        Number obj = 2424;
        obj = str1;

        // Ковариантность
        String[] strArray =  new String[0];
        Object[] objArray =  strArray;
        objArray = strArray;

        // Ковариантность List
        List<Integer> intList = new ArrayList<>();
        List<Double> dubList = new ArrayList<>();
        List<? extends Number> numList = intList;

        for (Number d :
                numList) {
            System.out.println(d.longValue());
        }

        // Контравариантность List
        List<Number> objList1 = new ArrayList<>();
        List<Object> objList2 = new ArrayList<>();
        List<? super Number> numList1 = objList2;

        // Инвариантность
        List<String> strList = new ArrayList<>();

//        PECS

        List<Object> integer = List.of(new Object());
        List<Number> numbers = new ArrayList<>();
    }
}
