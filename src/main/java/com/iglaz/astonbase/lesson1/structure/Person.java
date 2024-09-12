package com.iglaz.astonbase.lesson1.structure;

public class Person {
    final private int age;
    final private String name;
    static int counter;

    static {
        System.out.println("Static init");
    }

    {
        System.out.println("Instatce init");
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
        counter++;

        System.out.println("In constructor");
    }

    public void sayHello(String str) {
        System.out.println("Hey, my name is... " + name);
    }

    public void sayHello(int number) {
        System.out.println("Hey, my name is... " + name);
    }

    public static int getCounter() {
        return counter;
    }
}
