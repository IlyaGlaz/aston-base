package com.iglaz.astonbase.lesson9.prototype;

public class Rectangle extends Shape {
    int z;

    public Rectangle(int x, String color, int y, int z) {
        super(x, color, y);
        this.z = z;
    }

    public Rectangle(Rectangle rectangle) {
        super(rectangle);
        this.z = rectangle.z;
    }

    @Override
    Shape copy() {
        return new Rectangle(this);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "z=" + z +
                ", color='" + color + '\'' +
                ", y=" + y +
                ", x=" + x +
                '}';
    }
}
