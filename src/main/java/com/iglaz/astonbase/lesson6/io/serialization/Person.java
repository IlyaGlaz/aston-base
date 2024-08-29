package com.iglaz.astonbase.lesson6.io.serialization;

import com.iglaz.astonbase.lesson2.object.Client;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private int age;
    private  String firstName;
    private  String secondName;
    private Person person;
    private Client client;

    public Person(int age, String firstName) {
        this.age = age;
        this.firstName = firstName;
    }

    public Person(int age, Person person, String firstName) {
        this.age = age;
        this.person = person;
        this.firstName = firstName;
    }

    public Person(int age, String firstName, Client client) {
        this.client = client;
        this.age = age;
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
                ", secondName='" + secondName + '\'' +
                ", person=" + person +
                ", client=" + client +
                '}';
    }
}
