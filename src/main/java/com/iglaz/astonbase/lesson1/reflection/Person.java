package com.iglaz.astonbase.lesson1.reflection;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id)
                && Objects.equals(id1, person.id1)
                && Objects.equals(id2, person.id2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, id1, id2);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}
