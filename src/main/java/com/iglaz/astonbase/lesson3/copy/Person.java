package com.iglaz.astonbase.lesson3.copy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person implements Cloneable, Comparable<Person> {
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
    protected Person clone() throws CloneNotSupportedException {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name)
                && Objects.equals(age, person.age)
                && Objects.equals(preferFilms, person.preferFilms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, preferFilms);
    }

    @Override
    public int compareTo(Person o) {
        return o.age - age;
    }
}
