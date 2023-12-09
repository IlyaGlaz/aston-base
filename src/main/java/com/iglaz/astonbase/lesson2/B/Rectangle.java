package com.iglaz.astonbase.lesson2.B;

public class Rectangle extends Shape {
    private double w, h;

    public Rectangle(double w, double h) {
        this.w = w; this.h = h;
    }

    @Override
    public double area() {
        return w*h;
    }

    @Override
    public double circumference() {
        return 2*(w + h);
    }

    public double getWidth() {
        return w;
    }

    public double getHeight() {
        return h;
    }
}

