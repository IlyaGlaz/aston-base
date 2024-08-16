package com.iglaz.astonbase.lesson3;

//public class Trader implements Buyer, Seller {
//
//}

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
