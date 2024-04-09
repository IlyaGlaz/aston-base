package com.iglaz.astonbase.lesson7.part1;

import java.util.Random;

public class CustomThead extends Thread {
    private final Random random = new Random();

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(getName() + " " + random.nextInt(10));
        }
    }
}
