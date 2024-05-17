package com.iglaz.astonbase.lesson3.B;

public abstract class Shape {
    public abstract double area();
    public abstract double circumference();
    private int x;

    public Shape() {

    }

    public Shape(int x) {
        this.x = x;
    }

    private void print() {
        System.out.println("In Parent");
    }
}

