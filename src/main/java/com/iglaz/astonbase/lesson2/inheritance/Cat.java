package com.iglaz.astonbase.lesson2.inheritance;

public class Cat extends Animal {
    private String color;

    public Cat(int weight, int height) {
        super(weight, height);
        this.color = color;

        System.out.println("In cat Constructor");
    }

    @Override
    public void makeSound() {
        System.out.println("Mur - mur");
    }

    @Override
    public void performEat() {
        System.out.println("fish");
    }
}