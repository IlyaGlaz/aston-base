package com.iglaz.astonbase.lesson7.part1;


public class RunnableRunner {
    public static void main(String[] args) throws InterruptedException {
        CustomRunnable customRunnable = new CustomRunnable();
//
//        Runnable runnable = () -> {
//            for (int i = 0; i < 50; i++) {
//                System.out.println("hello");
//            }
//        };

        Thread thread1 = new Thread(customRunnable);
        Thread thread2 = new Thread(customRunnable);
        Thread thread3 = new Thread(customRunnable);
        Thread thread4 = new Thread(() -> System.out.println("Hello"));

//        thread1.setDaemon(true);
//        thread2.setDaemon(true);
//        thread3.setDaemon(true);
//        thread4.setDaemon(true);
//
        thread1.start();
        thread2.start();
        thread3.start();

//        thread1.join();
//        thread2.join();
//        thread3.join();
//        thread4.start();

//        someMethod();

        Thread.sleep(5);

        System.out.println("After method");

    }

//    static void someMethod() throws InterruptedException {
//        Thread.sleep(10000l);
//    }
}
