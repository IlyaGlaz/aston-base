package com.iglaz.astonbase.lesson3.A;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Gav-Gav");
    }

    @Override
    public void performEat() {
        System.out.println("Eat bones");
    }
}
