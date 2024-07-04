package com.iglaz.astonbase.lesson3.A;

public class Cat extends Animal{
    private String color;


    @Override
    public void makeSound() {
        System.out.println("Mau-Mau");
    }

    @Override
    public void performEat() {
        System.out.println("Eat mouse");
    }

    public void drinkMilk() {

    }
}
