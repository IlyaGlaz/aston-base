package com.iglaz.astonbase.lesson2.B;

public class Circle extends Object  {
    public static final double PI = 3.14159;
    protected double r;

    public Circle(double r) {
        this.r = r;
    }

    public double area() {
        return PI * r * r;
    }

    public double area(int r) {
        return PI * r * r * r;
    }

    public double circumference() {
        return 2 * PI * r;
    }

    public double getRadius() {
        return r;
    }

    public void setRadius(double r) {
        this.r = r;
    }
}
