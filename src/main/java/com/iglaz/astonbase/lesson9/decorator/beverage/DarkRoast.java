package com.iglaz.astonbase.lesson9.decorator.beverage;

public class DarkRoast extends Beverage {

    public DarkRoast(Size size) {
        description = "Dark Roast";
        price = 0.99;
        this.size = size;
    }

    @Override
    public double cost() {
        return price;
    }
}
