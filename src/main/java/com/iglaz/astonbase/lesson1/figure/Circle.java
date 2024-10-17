package com.iglaz.astonbase.lesson1.figure;

public class Circle {
    private double radius;
    private String name;

    public Circle(double radius, String name) {
        this.radius = radius;
        this.name = name;
    }

    public Circle(double radius) {
        this(radius, "Large");
    }

    double circumference() {
        return 2 * 3.14 * radius;
    }

    void some() {
        circumference();
    }

    void makeOlimpicCircles(Circle circle) {
        System.out.println("Some action");
    }
}
