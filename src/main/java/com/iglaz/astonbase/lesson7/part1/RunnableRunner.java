package com.iglaz.astonbase.lesson7.part1;

public class RunnableRunner {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new CustomRunnable());
        Thread thread2 = new Thread(new CustomRunnable());
        Thread thread3 = new Thread(new CustomRunnable());
        Thread thread4 = new Thread(() -> System.out.println("Hello world"));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
