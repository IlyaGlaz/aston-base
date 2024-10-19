package com.iglaz.astonbase.lesson2.inheritance;

public class AnimalDemo {
    public static void main(String[] args) {
        Cat cat = new Cat(22, 44);
        Animal ca2 = new Cat(14, 4);


        Animal[] zoo = {new Cat(22,44), new Dog(), new Cat(444, 44)};

        for (Animal an : zoo) {
            an.makeSound();
        }
    }

    void some(Animal animal) {
        animal.makeSound();
    }
}
