package com.iglaz.astonbase.lesson1.figure;

public class CircleClass {
    static double pi = 3.14;

    public static double circumference(double radius, String size) {
        System.out.println(size);
        return 2 * pi * radius;
    }
}
