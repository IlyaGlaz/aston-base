package com.iglaz.astonbase.lesson1.figure;

public class Circle {
    private double radius = 2.44;

    public Circle(double radius) {
        this.radius = radius;
    }

    double circumference() {
        return 2 * 3.14 * radius;
    }

    void some() {
        circumference();
    }
}
