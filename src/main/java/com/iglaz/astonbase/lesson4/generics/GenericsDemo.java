package com.iglaz.astonbase.lesson4.generics;

public class GenericsDemo {
    public static void main(String[] args) {
        AnyList anyList = new AnyList(10);

        anyList.add("String");
        anyList.add(22);
        anyList.add(22);

//        String str = (String) anyList.get(1);
//        str.length();
//        GenList<Integer> intList = new GenList<>(22);
//        intList.add(22);
    }

    // Инварианты
    static void putList(GenList<? extends Number> list) {

    }

    // Коварианты
    static void putArr(Number[] arr) {

    }

    static void putSingel(Number num) {
        System.out.println(num);
    }
}
