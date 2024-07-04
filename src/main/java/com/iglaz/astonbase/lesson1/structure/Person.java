package com.iglaz.astonbase.lesson1.structure;

import java.util.Objects;

public class Person {
    private int age;
    private String name;
    static int counter;

    static {
        System.out.println("Static block");
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
        counter++;
        System.out.println("In constructor");
    }

    public Person() {
    }

    void sayHello() {
        System.out.println("Hey, my name is... " + age);
    }

    void sayHello(int... num) {
        System.out.println(num[1]);
        System.out.println("Hey, my name is... " + age);
    }

    int sayHello(int good1, boolean good) {
        System.out.println("Hey, my name is... " + age);
        return 22;
    }

    static void getCounter() {
        System.out.println(counter);
    }

    static void meeting(Person person1, Person person2) {
        person1.sayHello();
        person2.sayHello();
    }

    protected int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 100) {
            this.age = age;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age
                && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    static int meet(Person person, Person person12) {
        return person.getAge() + person12.getAge();
    }
}
