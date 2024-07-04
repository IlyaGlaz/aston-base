package com.iglaz.astonbase.lesson3.A;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal[] zoo = {new Cat(), new Dog()};

        Cat cat = new Cat();

    }

    void goToZoo(Animal animal) {
        animal.makeSound();
    }
}
