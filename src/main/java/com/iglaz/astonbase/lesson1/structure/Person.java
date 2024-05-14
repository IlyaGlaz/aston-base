package com.iglaz.astonbase.lesson1.structure;

public class Person {
    protected int age;
    String name;

    public Person() {

    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hey, my name is...");
    }

    protected int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

