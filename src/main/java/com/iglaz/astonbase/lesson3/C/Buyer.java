package com.iglaz.astonbase.lesson3.C;

public interface Buyer {

    default void call() {
        System.out.println("Buy");
    }
}
