package com.iglaz.astonbase.lesson3.A;

public interface Predator {
    final static String HUNT = "hunt";

    void hunt();

    default void someMethod() {
        System.out.println("some method");
    }
}
