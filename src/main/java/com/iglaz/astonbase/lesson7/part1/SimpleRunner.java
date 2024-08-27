package com.iglaz.astonbase.lesson7.part1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SimpleRunner {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Before");

        simple();

        System.out.println("After");
    }

    static void simple() throws InterruptedException {
        System.out.println("In method start");

        new Thread(() -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Finish");
        }).start();

        ThreadLocal<Integer>;
        Lock lock = new ReentrantLock();

        lock.tryLock();

        lock.unlock();

    }
}
