package com.iglaz.astonbase.lesson2.inheritance;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal cat = new Cat(22, 44);

        cat.performEat();

        Swimingable.someStatic();
    }
}
