package com.iglaz.astonbase.lesson7.part1;

public class SimpleRunner {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Before");

        simple();

        System.out.println("After");
    }

    static void simple() throws InterruptedException {
        System.out.println("In method start");

        new Thread(() -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Finish");
        }).start();
    }
}
