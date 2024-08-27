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
        Thread thread4 = new Thread(() -> System.out.println("Hello from lambda"));
//
        thread1.start();
        thread2.start();
        thread3.start();


        thread1.join();
        System.out.println("After 1 ");
        thread2.join();
        System.out.println("After 2");
        thread3.join();
        System.out.println("After 3");
//        thread4.start();

//        someMethod();

//        Thread.sleep(15);

        System.out.println("After method");
    }

//    static void someMethod() throws InterruptedException {
//        Thread.sleep(10000l);
//    }
}
