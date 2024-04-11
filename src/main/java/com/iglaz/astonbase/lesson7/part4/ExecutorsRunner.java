package com.iglaz.astonbase.lesson7.part4;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
//        ExecutorService executorService1 = Executors.newSingleThreadExecutor();
//        ExecutorService executorService2 = Executors.newCachedThreadPool();
        ExecutorService executorService3 = Executors.newWorkStealingPool();

        executorService.execute(() -> System.out.println("hello " + Thread.currentThread().getName()));
        executorService.submit(() -> System.out.println("hello " + Thread.currentThread().getName()));
        executorService.submit(() -> System.out.println("hello " + Thread.currentThread().getName()));
        executorService.submit(() -> System.out.println("hello " + Thread.currentThread().getName()));

        Future<Integer> result = executorService.submit(() -> 20);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println(result.get());

//        executorService.submit(() -> System.out.println("hello " + Thread.currentThread().getName()));
//        executorService.submit(() -> System.out.println("hello " + Thread.currentThread().getName()));

//        Future<Integer> result = executorService.submit(() -> {
//            Thread.sleep(5000);
//            return 22;
////        });
//
//        executorService.execute(() -> System.out.println("Hello"));
//        executorService.execute(() -> System.out.println("Hello"));
//        executorService.execute(() -> System.out.println("Hello"));

//        System.out.println(result.get());
//        System.out.println(result.get());
//        System.out.println(result.get());
//        System.out.println(result.get());

//        executorService.submit(() -> Thread.sleep(5));


        System.out.println("Конец");
        executorService.shutdown();
    }
}
