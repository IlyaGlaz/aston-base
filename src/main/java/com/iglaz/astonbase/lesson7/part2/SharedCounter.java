package com.iglaz.astonbase.lesson7.part2;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 9 -> 9 + 1 -> 10
 * 10 -> 10 + 1 -> 11
 * 10 -> 10 -> 11
 * <p>
 * 11   ====   11  ------> ++++++ 11
 * <p>
 *
 *
 * C compare 10 --> 11 -----> 11 -----> 11
 * A and
 * S swap
 */
public class SharedCounter {
    private AtomicInteger counter = new AtomicInteger();

    void increment() {
        // III     I        II
        counter.incrementAndGet();
    }

    synchronized static void someMethod() {
        System.out.println();
    }

    public AtomicInteger getUserCounter() {
        return counter;
    }
}
