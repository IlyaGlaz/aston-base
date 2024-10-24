package com.iglaz.astonbase.lesson2.inheritance;

public class AnimalDemo {
    public static void main(String[] args) {
        Cat cat = new Cat(22, 44);
        Animal cat2 = new Cat(14, 4);

        Cat cat3 = (Cat) cat2;
        cat3.runForMouse();

        Animal[] zoo = {new Cat(22,44), new Dog(), new Cat(444, 44)};

        for (Animal an : zoo) {
            if (an instanceof Cat an2) {
                an2.runForMouse();
            }
        }

        Animal dog = new Dog();

        some(dog);

        Swimingable.someStatic();
    }

    static void some(Animal animal) {
        animal.makeSound();
    }

    static void some(Swimingable swimingable) {
        swimingable.swim();
    }
}
