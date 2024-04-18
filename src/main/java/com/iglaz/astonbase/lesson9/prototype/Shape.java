package com.iglaz.astonbase.lesson9.prototype;

abstract class Shape {
    int x;
    int y;
    String color;

    public Shape(int x, String color, int y) {
        this.x = x;
        this.color = color;
        this.y = y;
    }

    public Shape(Shape shape) {
        this.x = shape.x;
        this.y = shape.y;
        this.color = shape.color;
    }

    abstract Shape copy();

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }
}