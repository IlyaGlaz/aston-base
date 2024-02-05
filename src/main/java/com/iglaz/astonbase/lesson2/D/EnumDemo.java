package com.iglaz.astonbase.lesson2.D;

import java.util.Arrays;

public class EnumDemo {
    public static void main(String[] args) {
        System.out.println(Color.RED == Color.RED);

        Color[] values = Color.values();
        Color red = Color.valueOf("RED");

        System.out.println(Arrays.toString(values));
    }
}
