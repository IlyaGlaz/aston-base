package com.iglaz.astonbase.lesson1.structure;

public class Person {
    int age = 22;
    String name = "Vanya";

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hey, my name is... " + name);
    }
}
