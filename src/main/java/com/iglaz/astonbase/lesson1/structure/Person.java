package com.iglaz.astonbase.lesson1.structure;

public class Person {
    private int age;
    private String name;
    static int counter;

    static {
        System.out.println("Static init");
    }

    {
        System.out.println("Instatce init");
    }

    public Person(int age, String name) {
        this.age = 22;
        this.name = name;

        System.out.println("In constructor");
    }

    public void sayHello() {
        System.out.println("Hey, my name is... " + name);
    }

    public void sayHello(int number) {
        System.out.println("Hey, my name is... " + name);
    }

    public static int getCounter() {
        return counter;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Ошибка");
        } else {
            this.age = age;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    private class Pet {

    }
}
