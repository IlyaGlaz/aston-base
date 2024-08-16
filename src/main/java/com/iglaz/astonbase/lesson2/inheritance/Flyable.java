package com.iglaz.astonbase.lesson2.inheritance;

public interface Flyable {
    static int age = 22;

    void fly();

    default void someMethod() {
        System.out.println("");
    }
}
