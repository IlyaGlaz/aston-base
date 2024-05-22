package com.iglaz.astonbase.lesson2.object;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Client implements Cloneable {
    private final String name;
    private final Integer age;
    private List<String> films = new ArrayList<>();

    public Client(Client client) {
        this.name = client.name;
        this.age = client.age;
        this.films = new ArrayList<>(client.films);
    }

    public Client(String name, int age, List<String> films) {
        this.name = name;
        this.age = age;
        this.films = new ArrayList<>(films);
    }

    public Client(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void addFilm(String film) {
        films.add(film);
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public List<String> getFilms() {
        return new ArrayList<>(films);
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", films=" + films +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(name, client.name) && Objects.equals(age, client.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public Client clone() throws CloneNotSupportedException {
        Client clone = (Client) super.clone();
        clone.films = new ArrayList<>(this.films);

        return clone;
    }
}
