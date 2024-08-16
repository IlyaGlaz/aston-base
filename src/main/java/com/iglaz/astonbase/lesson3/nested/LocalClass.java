package com.iglaz.astonbase.lesson3.nested;

import com.iglaz.astonbase.lesson2.inheritance.Flyable;

public class LocalClass {
    public static void main(String[] args) {
        class someClass {

        }

        someClass someClass = new someClass();


        Flyable flyable = new Flyable() {

            @Override
            public void fly() {
                System.out.println();
            }

        };

        flyable.fly();
    }
}
