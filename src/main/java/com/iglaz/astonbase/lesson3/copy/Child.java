package com.iglaz.astonbase.lesson3.copy;

import java.util.List;

public class Child extends Person implements Cloneable {
    String color;

    public Child(Person person) {
        super(person);
    }

    public Child(String name, int age) {
        super(name, age);
    }

    public Child(String name, int age, List<String> list) {
        super(name, age, list);
    }
}
