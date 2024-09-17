package com.iglaz.astonbase.lesson2.inheritance;

public class Dog extends Animal implements Swimingable {
    @Override
    public void makeSound() {
        System.out.println("Gav-Gav");
    }

    @Override
    public void performEat() {
        System.out.println("Eat bones");
    }

    @Override
    public void swim() {
        System.out.println("");
    }
}
