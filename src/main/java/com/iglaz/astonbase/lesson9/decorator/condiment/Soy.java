package com.iglaz.astonbase.lesson9.decorator.condiment;

import com.iglaz.astonbase.lesson9.decorator.beverage.Beverage;

public class Soy extends Decorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
        price = 0.15;
        size = beverage.getSize();
    }

    @Override
    public double cost() {
        return beverage.cost() + calculatePrice();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
