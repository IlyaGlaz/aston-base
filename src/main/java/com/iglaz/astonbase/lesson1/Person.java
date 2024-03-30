package com.iglaz.astonbase.lesson1;
import java.util.ArrayList;

class Person {
    Manager manager;
    int age;
    String name;
    final ArrayList<String> str = new ArrayList<>();

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void work() {
        manager.work();
    }

    public void work(long num) {
        manager.work();
    }

    public double work(long num, String str) {
        manager.work();
        return 2.2;
    }

    public void work(boolean some) {
        System.out.println("sdfa");

        manager.work();
    }

    public void sleep() {

    }
}

