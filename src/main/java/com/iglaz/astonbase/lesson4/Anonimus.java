package com.iglaz.astonbase.lesson4;

import com.iglaz.astonbase.lesson2.inheritance.Animal;

public class Anonimus {
    public static void main(String[] args) {
        Animal animal = new Animal() {

            @Override
            public void makeSound() {
                System.out.println();
            }

            @Override
            public void performEat() {
                System.out.println();
            }
        };

        animal.makeSound();

    }
}
