package com.iglaz.astonbase.lesson7.part1;

public class CustomRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
        }
    }
}
