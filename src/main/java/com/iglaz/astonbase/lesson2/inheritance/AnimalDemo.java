package com.iglaz.astonbase.lesson2.inheritance;

import java.util.LinkedList;
import java.util.List;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal[] zoo = {new Cat(), new Dog(), new Cat(), new Dog()};

        List<String> list = new LinkedList<>();

        list.add("Str");

        for (Animal a : zoo) {
            a.makeSound();
        }
    }

    static void some(Animal animal) {
        animal.makeSound();
    }
}
