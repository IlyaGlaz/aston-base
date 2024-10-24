package com.iglaz.astonbase.lesson3.en;

public class EnumDemo {
    public static void main(String[] args) {
        Color green = Color.GREEN;

        System.out.println(green.getB());

        System.out.println(green);

        Color[] values = Color.values();

        Color blue = Color.valueOf("blue");

        green.ordinal();
    }
}
