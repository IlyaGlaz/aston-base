package com.iglaz.astonbase.lesson7.part2;

public class UserLogIn extends Thread {

    private final UserCounter counter;

    public UserLogIn(UserCounter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}
