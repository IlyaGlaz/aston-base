package com.iglaz.astonbase.lesson2.string;

public class StringEfficiency {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        String result = "";
        for (int i = 0; i < 10_000; i++) {
            result += i;
        }

        long finishTime = System.currentTimeMillis();
        System.out.println(finishTime - startTime);
    }
}
