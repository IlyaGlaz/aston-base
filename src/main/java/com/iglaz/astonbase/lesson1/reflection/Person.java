package com.iglaz.astonbase.lesson1.reflection;

public abstract class Person {

    private Long id;
    private Long id1;
    private Long id2;

    public Person(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}
