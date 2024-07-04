package com.iglaz.astonbase.lesson3.A;

public abstract class Animal {
    static final String PROPERTY_SOME = "property";
    private int weight;
    private int height;

    public abstract void makeSound();

    public abstract void performEat();
}
