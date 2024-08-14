package com.iglaz.astonbase.lesson3;

public class Trader implements Buyer, Seller {

    @Override
    public void call() {
        System.out.println();
    }
}

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
