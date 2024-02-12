package com.iglaz.astonbase.lesson3.copy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Person implements Cloneable, Comparable<Person> {
    String name;
    Integer age;
    List<String> preferFilms = new ArrayList<>();

    public Person(Person person) {
        this.name = person.name;
        this.age = person.age;
        this.preferFilms = new ArrayList<>(person.preferFilms);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, List<String> list) {
        this.name = name;
        this.age = age;
        this.preferFilms = new ArrayList<>(list);
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

    public Integer getAge() {
        return age;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Person clone = (Person) super.clone();

        clone.preferFilms = new ArrayList<>(this.preferFilms);
        return clone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", preferFilms=" + preferFilms +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return o.age - age;
    }
}
