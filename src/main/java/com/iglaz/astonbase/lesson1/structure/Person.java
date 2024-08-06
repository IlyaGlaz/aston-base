package com.iglaz.astonbase.lesson1.structure;

public class Person {
    private int age;
    private String name;
    private int counter;

    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this(22);
        this.name = name;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
        counter++;
    }

    void sayHello() {
        System.out.println("Hey, my name is... " + name);
    }

    static void meetTwoPerson() {
        System.out.println("static");
    }

    public  int getCounter() {
        return counter;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    static Person createOld() {
        return new Person(99, "Ivanich");
    }
}
