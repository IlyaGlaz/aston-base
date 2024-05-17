package com.iglaz.astonbase.lesson3.B;

public interface Positionable {
    void setPosition(double x, double y);

    double getX();

    double getY();

    default void simple() {
        System.out.println();
    }
}
