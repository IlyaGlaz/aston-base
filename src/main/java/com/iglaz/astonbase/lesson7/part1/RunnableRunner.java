package com.iglaz.astonbase.lesson7.part1;


public class RunnableRunner {
    public static void main(String[] args) throws InterruptedException {
        CustomRunnable customRunnable = new CustomRunnable();

        Runnable runnable = () -> {
            for (int i = 0; i < 50; i++) {
                System.out.println("hello");
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        Thread thread4 = new Thread(runnable);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
