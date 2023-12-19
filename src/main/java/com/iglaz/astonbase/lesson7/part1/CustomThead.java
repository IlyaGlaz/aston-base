package com.iglaz.astonbase.lesson7.part1;

public class CustomThead extends Thread {

    @Override
    public void run() {
        System.out.println("Hello " + getName());
    }
}
