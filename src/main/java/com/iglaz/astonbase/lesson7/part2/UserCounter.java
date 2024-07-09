package com.iglaz.astonbase.lesson7.part2;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 9 -> 9 + 1 -> 10
 * 9 -> 9 + 1 -> 11
 * 10 -> 10 -> 11
 *
 * 11   ====   11  ------> ++++++ 11
 *
 * CAS
 *
 */
public class UserCounter {
   private AtomicInteger counter = new AtomicInteger();

    void increment() {
         // III     I        II
        counter.incrementAndGet();
    }

   public AtomicInteger getUserCounter() {
        return counter;
    }
}
