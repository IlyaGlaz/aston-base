package com.iglaz.astonbase.lesson3.en;

public enum Color  {
    BLUE(22, 44, 44) {
    },

    RED(105, 0, 222) {
    },

    GREEN(11, 444, 22) {
    };

    final int r;
    final int g;
    final int b;

    Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public int getG() {
        return g;
    }

    public int getR() {
        return r;
    }
}