package com.iglaz.astonbase.lesson2.inheritance;

public class Animal {
    private int weight;
    private int height;

    public Animal() {
        System.out.println("In Animal constructor");
    }

    public Animal(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public void makeSound() {
        System.out.println("Sound");
        System.out.println(weight);
    }

    public  void performEat() {
        System.out.println("Eat");
    }

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
