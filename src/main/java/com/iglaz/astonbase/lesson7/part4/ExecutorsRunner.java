package com.iglaz.astonbase.lesson7.part4;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        ExecutorService executorService1 = Executors.newSingleThreadExecutor();
        ExecutorService executorService2 = Executors.newCachedThreadPool();
        ExecutorService executorService3 = Executors.newWorkStealingPool();

        Future<Integer> submit = executorService.submit(() -> {
            Thread.sleep(4000);
            return 22 * 22;
        });

        if (submit.isDone()) {
            System.out.println(submit.get());
        }

        executorService.shutdown();
        System.out.println("Конец");
    }
}
