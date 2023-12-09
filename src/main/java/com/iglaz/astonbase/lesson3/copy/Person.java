package com.iglaz.astonbase.lesson3.copy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Person implements Cloneable {
    String name;
    int age;
    List<String> preferFilms = new ArrayList<>();

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, List<String> list) {
        this.name = name;
        this.age = age;
        this.preferFilms = new ArrayList<>(list);
    }

    public Person(Person copy) {
        name = copy.getName();
        age = copy.getAge();
        preferFilms = new ArrayList<>(copy.getPreferFilms());
    }

    public void addFilm(String film) {
        preferFilms.add(film);
    }

    public List<String> getPreferFilms() {
        return preferFilms;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public Person clone() throws CloneNotSupportedException {
        Person clone = (Person) super.clone();

        clone.preferFilms = new ArrayList<>(this.preferFilms);
        return clone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age
                && Objects.equals(name, person.name)
                && Objects.equals(preferFilms, person.preferFilms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, preferFilms);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", preferFilms=" + preferFilms +
                '}';
    }
}
