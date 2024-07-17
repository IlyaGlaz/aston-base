package com.iglaz.astonbase.lesson9.decorator.beverage;

public class Decaf extends Beverage {

    public Decaf(Size size) {
        description = "Decaf";
        price = 1.05;
        this.size = size;
    }

    @Override
    public double cost() {
        return price;
    }
}
