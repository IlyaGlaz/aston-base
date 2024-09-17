package com.iglaz.astonbase.lesson2.inheritance;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;

public interface Swimingable {
    int NUMBER = 22;

    void swim();

    default void someMethod() {
        System.out.println("aome");
    }

    static void someStatic() {
    }
}
