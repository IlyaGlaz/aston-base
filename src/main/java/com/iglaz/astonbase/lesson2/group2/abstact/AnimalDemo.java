package com.iglaz.astonbase.lesson2.group2.abstact;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal giraffe = new Giraffe();
        giraffe.makeSound();

        Animal lion = new Cat();
        lion.makeSound();

        Animal cat = new Cat();
        cat.makeSound();

        Preditator.perforFastRun();

        int[] numbers = {1, 2};

        System.out.println(numbers instanceof Object);
    }
}
