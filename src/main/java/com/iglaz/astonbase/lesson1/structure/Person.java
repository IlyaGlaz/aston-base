package com.iglaz.astonbase.lesson1.structure;

public class Person {
    private int age;
    private String name;

    {
        System.out.println("Instance block");
    }

    static {
        System.out.println("Static block");
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Person() {
        this(0, "Ivan");
    }

    static void sayHello() {
        System.out.println("Hey, my name is...");
    }

    void sayHello(String str) {
        System.out.println("Hey, my name is..." + str);
    }

    void sayHello(int str) {
        System.out.println("Hey, my name is..." + str);
    }

    void sayHello(int str, String str2) {
        System.out.println("Hey, my name is..." + str);
    }

    void sayHello(String str, int str2) {
        System.out.println("Hey, my name is..." + str);
    }

    protected int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException();
        }
    }

    static int meet(Person person, Person person12) {
        return person.getAge() + person12.getAge();
    }
}
