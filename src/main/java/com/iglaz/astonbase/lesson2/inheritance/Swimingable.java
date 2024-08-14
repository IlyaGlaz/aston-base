package com.iglaz.astonbase.lesson2.inheritance;

public interface Swimingable extends Flyable {
    void swim();

    @Override
    void fly();
}
