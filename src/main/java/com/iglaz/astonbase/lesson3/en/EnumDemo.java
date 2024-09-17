package com.iglaz.astonbase.lesson3.en;

public class EnumDemo {
    public static void main(String[] args) {
        Color green = Color.GREEN;
        green.getB();

        Color red = Color.RED;
        System.out.println(red.ordinal());

        System.out.println(Color.RED == Color.GREEN);

        Color[] values = Color.values();

        System.out.println(green.name());

        Color green1 = Color.valueOf("green".toUpperCase());
    }
}
