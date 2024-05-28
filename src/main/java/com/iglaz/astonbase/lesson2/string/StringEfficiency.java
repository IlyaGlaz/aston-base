package com.iglaz.astonbase.lesson2.string;

public class StringEfficiency {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 1000_000; i++) {
            result.append(i);
        }

        long finishTime = System.currentTimeMillis();
        System.out.println(finishTime - startTime);
    }
}
