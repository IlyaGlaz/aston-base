package com.iglaz.astonbase.lesson2.object;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Client implements Cloneable, Serializable {
    private String name;
    private final int age;
    private List<String> films = new ArrayList<>();

    public Client(Client client) {
        this.name = client.name;
        this.age = client.age;
        this.films = new ArrayList<>(client.getFilms());
    }

    public Client(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void addFilms(String film) {
        films.add(film);
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

        return Objects.equals(name, client.name)
                && Objects.equals(age, client.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public List<String> getFilms() {
        return films;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFilms(List<String> films) {
        this.films = films;
    }

    @Override
    public Client clone() throws CloneNotSupportedException {
        Client clone = (Client) super.clone();
        clone.setFilms(new ArrayList<>(this.films));

        return clone;
    }

    public Client copy() {
        return new Client(this);
    }
}

