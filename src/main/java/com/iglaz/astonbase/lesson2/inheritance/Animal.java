package com.iglaz.astonbase.lesson2.inheritance;

public abstract class Animal {
    private int weight;
    private int height;

    public Animal() {
        System.out.println("In Animal constructor");
    }

    public Animal(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    protected abstract void makeSound();

    public abstract void performEat();

    static void staticMethod() {
        System.out.println("Animlstatic");
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }
}
