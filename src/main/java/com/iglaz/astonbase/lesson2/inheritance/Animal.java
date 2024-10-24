package com.iglaz.astonbase.lesson2.inheritance;

import java.util.Objects;

public abstract class Animal {
    private static final int CONST = 100;
    protected int weight;
    protected int height;

    public Animal() {
        System.out.println("In Animal constructor");
    }

    public Animal(int weight, int height) {
        this.weight = weight;
        this.height = height;

        System.out.println("in animal");
    }

    public abstract void makeSound();

    public abstract void performEat();

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public void setWeight(int weight) {
        if (weight <= CONST) {
            this.weight = weight;
        }
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        return weight == animal.weight
                && height == animal.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, height);
    }
}
