package com.iglaz.astonbase.lesson2.inheritance;

public class Cat extends Animal {

    public Cat() {
        super();
        System.out.println("In Cat constructor");
    }

    public Cat(int weight, int height) {
        super(weight, height);
    }

    public void makeSound() {
        System.out.println("Mau-Mau" + " " + getHeight());
    }

    @Override
    public void performEat() {
        System.out.println("Eat mouse");
    }

    static void staticMethod() {
        System.out.println("CatStatic");
    }
}
