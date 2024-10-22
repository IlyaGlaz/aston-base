package com.iglaz.astonbase.lesson2.inheritance;

public class AnimalDemo {
    public static void main(String[] args) {
        Cat cat = new Cat(22, 44);
        Animal cat2 = new Cat(14, 4);
        cat.runForMouse();
        cat2.performEat();

        Cat cat3 = (Cat) cat2;
        cat3.runForMouse();

        Animal[] zoo = {new Cat(22,44), new Dog(), new Cat(444, 44)};

        for (Animal an : zoo) {
            if (an instanceof Cat an2) {
                an2.runForMouse();
            }
        }
    }

    void some(Animal animal) {
        animal.makeSound();
    }
}
