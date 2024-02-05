package com.iglaz.astonbase.lesson2.C;//package com.iglaz.simpleproject.base.lesson2.C;


interface Buyer {

    default void call() {
        System.out.println("Buy");
    }
}

interface Seller {

    default void call() {
        System.out.println("Sell");
    }
}

//public class Person implements Buyer, Seller {
//
//    @Override
//    public void call() {
//        System.out.println("eheh");
//    }
//}

