package com.iglaz.astonbase.lesson7.part1;

public class RunnableRunner {
    public static void main(String[] args) {
        CustomRunnable customRunnable = new CustomRunnable();

//        Thread tread1 = new Thread(customRunnable);
//        Thread tread2 = new Thread(customRunnable);
//        Thread tread3 = new Thread(customRunnable);
        Thread tread4 = new Thread(() -> System.out.println("Hello from lambda"));
        Thread tread5 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
            }
        });

//        tread1.start();
//        tread2.start();
//        tread3.start();
        tread4.start();
        tread5.start();
    }
}
