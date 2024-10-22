package com.iglaz.astonbase.lesson3;

public class ColorRunner {
    public static void main(String[] args) {
        Color red = Color.GREEN;

        Color[] values = Color.values();

        Color green = Color.valueOf("BLUE");
        System.out.println(green.getR());
    }
}
