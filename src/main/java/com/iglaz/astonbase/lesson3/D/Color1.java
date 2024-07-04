package com.iglaz.astonbase.lesson3.D;

public enum Color1 {
    RED(2, 2, 2),
    GREEN(22, 44,55),
    BLUE(150, 234, 234);

    int red;
    int blue;
    int green;

    public int getRed() {
        return red;
    }

    public int getBlue() {
        return blue;
    }

    public int getGreen() {
        return green;
    }

    Color1(int red, int blue, int green) {
        this.red = red;
        this.blue = blue;
        this.green = green;
    }
}
