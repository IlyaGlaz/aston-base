package com.iglaz.astonbase.lesson7.part4;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorsRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
//        ExecutorService executorService1 = Executors.newSingleThreadExecutor();
//        ExecutorService executorService2 = Executors.newCachedThreadPool();
//        ExecutorService executorService3 = Executors.newWorkStealingPool();

        executorService.execute(() -> System.out.println("hello " + Thread.currentThread().getName()));
        executorService.submit(() -> System.out.println("hello " + Thread.currentThread().getName()));
//        executorService.submit(() -> Thread.sleep(5));
        executorService.submit(() -> System.out.println("hello " + Thread.currentThread().getName()));
        executorService.submit(() -> System.out.println("hello " + Thread.currentThread().getName()));
        executorService.submit(() -> System.out.println("hello " + Thread.currentThread().getName()));
        executorService.submit(() -> System.out.println("hello " + Thread.currentThread().getName()));
        executorService.submit(() -> System.out.println("hello " + Thread.currentThread().getName()));
        executorService.submit(() -> System.out.println("hello " + Thread.currentThread().getName()));
        executorService.submit(() -> System.out.println("hello " + Thread.currentThread().getName()));
        executorService.submit(() -> System.out.println("hello " + Thread.currentThread().getName()));
        executorService.submit(() -> System.out.println("hello " + Thread.currentThread().getName()));
        executorService.submit(() -> System.out.println("hello " + Thread.currentThread().getName()));

        System.out.println("Конец");
        executorService.shutdown();
    }
}
