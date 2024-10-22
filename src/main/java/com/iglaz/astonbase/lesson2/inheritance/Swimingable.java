package com.iglaz.astonbase.lesson2.inheritance;

public interface Swimingable{
    void swim();

    default void someMethod() {
        System.out.println("Some");
    }

    static void staticMethod() {
        System.out.println();
    }
}
