package com.iglaz.astonbase.lesson3.en;

public class EnumDemo {
    public static void main(String[] args) {
        Color blue = Color.BLUE;
        Color[] values = Color.values();

        Color green = Color.valueOf("GREEN");

        System.out.println(green.getB());
    }
}
