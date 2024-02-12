package com.iglaz.astonbase.lesson4.generics;

import java.util.ArrayList;
import java.util.List;

public class InCoContrGenDemo {
    public static void main(String[] args) {
        String str1 = "";
        Object obj = str1;

        // Ковариантность
        String[] strArray =  new String[0];
        Object[] objArray =  strArray;

        // Ковариантность List
        List<Integer> intList = new ArrayList<>();
        List<Double> dubList = new ArrayList<>();
        List<? extends Number> numList = intList;
        numList = dubList;

        for (Number d :
                numList) {
            System.out.println(d.longValue());
        }

        // Контравариантность List
        List<Number> objList1 = new ArrayList<>();
        List<? super Number> numList1 = new ArrayList<>();
        numList1 = objList1;

        // Инвариантность
        List<String> strList = new ArrayList<>();

//        PECS

        List<Object> integer = List.of(new Object());
        List<Number> numbers = new ArrayList<>();
    }
}
