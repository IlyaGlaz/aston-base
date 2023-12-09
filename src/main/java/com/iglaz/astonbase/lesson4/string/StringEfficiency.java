package com.iglaz.astonbase.lesson4.string;

public class StringEfficiency {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        StringBuffer result = new StringBuffer();
        for (int i = 0; i < 100_000; i++) {
            result.append(i);
            result.reverse();
        }

        long finishTime = System.currentTimeMillis();
        System.out.println(finishTime - startTime);
    }
}
