package com.iglaz.astonbase.lesson6.io.serialization;

import java.io.Serializable;
import java.util.UUID;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private transient int age;
    private String firstName;

    public Person(int age, String firstName) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", firstName='" +
                '}';
    }
}
