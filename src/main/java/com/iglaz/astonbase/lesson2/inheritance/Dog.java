package com.iglaz.astonbase.lesson2.inheritance;

import java.io.Serializable;

public class Dog extends Animal implements Swimingable, Serializable {
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
        System.out.println("Swim");
    }
}
