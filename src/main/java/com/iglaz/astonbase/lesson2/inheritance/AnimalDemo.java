package com.iglaz.astonbase.lesson2.inheritance;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal animal1 = new Animal(22, 44);
        Animal animal2 = new Animal(22, 44);

        System.out.println(animal1.equals(animal2));
    }
}
