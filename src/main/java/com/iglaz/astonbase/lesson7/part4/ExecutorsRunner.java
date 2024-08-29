package com.iglaz.astonbase.lesson7.part4;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
//        ExecutorService executorService1 = Executors.newSingleThreadExecutor();
//        ExecutorService executorService2 = Executors.newCachedThreadPool();
//        ExecutorService executorService3 = Executors.newWorkStealingPool();

        executorService.submit(() -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("1");
        });
        executorService.submit(() -> {
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("2");
        });
        executorService.submit(() -> {
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("3");
        });
        executorService.submit(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("4");
        });
        System.out.println("In main");

        executorService.shutdown();
    }
}
