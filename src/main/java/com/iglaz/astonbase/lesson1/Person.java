package com.iglaz.astonbase.lesson1;

import java.util.List;

public class Person {
    int age;
    String name;
    List<Person> friends;

    public Person(int age, String name, List<Person> friends) {
        this.age = age;
        this.name = name;
        this.friends = friends;
    }

    void sayHello() {
        System.out.println("Hi there");
    }
}
