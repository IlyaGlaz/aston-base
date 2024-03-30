package com.iglaz.astonbase.lesson7;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MulithreadRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        while(scanner.hasNext()) {
            int number = scanner.nextInt();

            executorService.submit(() -> {
                try {
                    Thread.sleep(number * 1000);
                    System.out.println("Я спал " + number + " секунд в " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }

        executorService.shutdown();
    }
}
