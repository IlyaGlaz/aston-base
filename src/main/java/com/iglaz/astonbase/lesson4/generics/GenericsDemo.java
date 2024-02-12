package com.iglaz.astonbase.lesson4.generics;

public class GenericsDemo {
    public static void main(String[] args) {
//        AnyList anyList = new AnyList(10);
//
//        anyList.add("String");
//        anyList.add(22);
//
//        String o = (String) anyList.get(1);
//        o.length();
//
//        anyList.add(22);
//
        GenList<Integer> intList = new GenList<>(22);
        intList.add(22);

        Integer i = intList.get(0);
        i.byteValue();
    }
}
