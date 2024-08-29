package com.iglaz.astonbase.lesson7.part2;

public class IncrementThread extends Thread {

    private final SharedCounter counter;

    public IncrementThread(SharedCounter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}
