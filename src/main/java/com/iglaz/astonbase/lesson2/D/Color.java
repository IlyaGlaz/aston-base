package com.iglaz.astonbase.lesson2.D;

public enum Color implements Show {
    RED(255, 0, 0),
    GREEN(255, 0, 0),
    BLUE(10, 2, 2);

    final int r;
    final int g;
    final int b;

    Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    @Override
    public void show() {
        System.out.println("hello");
    }
}