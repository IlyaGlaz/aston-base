package com.iglaz.astonbase.lesson3.A;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal[] zoo = {new Cat(), new Dog(), new Lion()};
        Predator[] zoo2 = {new Lion(), new Cat()};

        for (Predator pred : zoo2) {
            pred.hunt();
        }

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
