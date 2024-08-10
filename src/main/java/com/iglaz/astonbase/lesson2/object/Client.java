package com.iglaz.astonbase.lesson2.object;

import java.util.Objects;

public final class Client {
    private final String name;
    private final Integer age;

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

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", age=" + age +
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
}
