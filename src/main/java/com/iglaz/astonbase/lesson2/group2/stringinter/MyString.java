package com.iglaz.astonbase.lesson2.group2.stringinter;

public class MyString {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        StringBuilder string = new StringBuilder();

        for (int i = 0; i < 10000_000; i++) {
           string.append(i);
           string.reverse();
        }

        long finishTime = System.currentTimeMillis();
        System.out.println(finishTime - startTime);
    }
}