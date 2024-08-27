package com.iglaz.astonbase.lesson6.io.serialization;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private transient int age;
    private String firstName;
    private Person person;

    public Person(int age, String firstName) {
        this.age = age;
    }

    public Person(int age, Person person, String firstName) {
        this.age = age;
        this.person = person;
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", person=" + person +
                '}';
    }
}
