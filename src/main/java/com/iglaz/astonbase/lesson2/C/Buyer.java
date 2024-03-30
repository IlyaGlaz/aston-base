package com.iglaz.astonbase.lesson2.C;

public interface Buyer {

    default void call() {
        System.out.println("Buy");
    }
}
