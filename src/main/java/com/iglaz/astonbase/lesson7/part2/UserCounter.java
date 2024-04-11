package com.iglaz.astonbase.lesson7.part2;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 9 -> 9 -> 10
 * 10 -> 10 -> xxx
 * 10 -> 10 -> 11
 */
public class UserCounter {
    private AtomicInteger counter = new AtomicInteger(0);

     void increment() {
        counter.incrementAndGet();
    }

    public AtomicInteger getUserCounter() {
        return counter;
    }
}
