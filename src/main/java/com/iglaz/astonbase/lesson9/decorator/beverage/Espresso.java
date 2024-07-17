package com.iglaz.astonbase.lesson9.decorator.beverage;

public class Espresso extends Beverage {

    public Espresso(Size size) {
        description = "Espresso";
        price = 1.99;
        this.size = size;
    }

    @Override
    public double cost() {
        return price;
    }
}
