package com.iglaz.astonbase.lesson4.generics;

public class GenericsDemo {
    public static void main(String[] args) {
//        AnyList anyList = new AnyList(10);
//
//        anyList.add("String");
//        anyList.add(22);
//        anyList.add(22);

        putSingel(22.2F);

        putList1(new GenList<Integer>(10));

        putArr(new Integer[]{});

    }

    // Инварианты
    static void putList1(GenList<? extends Number> list) {

    }

    // Контравариантность
    static void putList2(GenList<? super Number> list) {

    }

    // Коварианты
    static void putArr(Number[] arr) {

    }

    static void putSingel(Number num) {
        System.out.println(num);
    }
}
