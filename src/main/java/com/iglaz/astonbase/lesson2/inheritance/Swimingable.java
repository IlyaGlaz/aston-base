package com.iglaz.astonbase.lesson2.inheritance;

public interface Swimingable {
    int NUMBER = 22;

    void swim();

    default void someDefault() {
        System.out.println();
        somePrivate();
    }

    static void someStatic() {

    }

    private void somePrivate() {

    }
}
