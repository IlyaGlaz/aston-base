package com.iglaz.astonbase.lesson3.D;

public class EnumDemo {
    public static void main(String[] args) {
        System.out.println(Color.RED);

        Color blue = Color.BLUE;

        Color[] values = Color.values();
        System.out.println(Color.GREEN.ordinal());
        System.out.println(Color.RED.name());

        System.out.println(Color.RED == Color.GREEN);

        System.out.println(Color.GREEN);
    }
}
