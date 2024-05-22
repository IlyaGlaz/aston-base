package com.iglaz.astonbase.lesson3.A;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal[] zoo = {new Cat(), new Dog(), new Lion()};

        for (Animal animal : zoo) {
            if (animal instanceof Cat) {
                Cat cat = (Cat) animal;
                cat.drinkMilk();
            }
        }

        Cat cat = new Cat();
        cat.fly();
    }
}
