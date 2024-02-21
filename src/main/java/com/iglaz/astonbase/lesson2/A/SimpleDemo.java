package com.iglaz.astonbase.lesson2.A;

import com.iglaz.astonbase.lesson2.B.Circle;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(100);
        Circle circle2 = new Circle(100);
        Circle circle3 = new Circle(100);
        Circle circle4 = new Circle(100);

        String str = "Hello";
        Integer num = 22;
        int[] numbers = new int[2];

        ExecutorService threadPool = Executors.newFixedThreadPool(1);

    }
}
