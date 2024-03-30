package com.iglaz.astonbase.lesson1;

public class Manager {
    Person person;
    int firstname;

    public Manager(int firstname) {
        this.firstname = firstname;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void work() {
        System.out.println("Working");
    }
}
