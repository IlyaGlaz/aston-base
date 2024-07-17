package com.iglaz.astonbase.lesson9.decorator.condiment;

import com.iglaz.astonbase.lesson9.decorator.beverage.Beverage;

public abstract class Decorator extends Beverage {

    public static final double SIZE_DIFFERENCE = 0.05;
    protected Beverage beverage;

    public abstract String getDescription();

    public double getPrice() {
        return price;
    }

    public double calculatePrice() {
        if (size.equals(Size.BIG)) {
            price += SIZE_DIFFERENCE;
        } else if (size.equals(Size.SMALL)) {
            price -= SIZE_DIFFERENCE;
        }
        return price;
    }
}
