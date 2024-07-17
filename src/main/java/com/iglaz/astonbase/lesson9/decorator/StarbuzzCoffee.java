package com.iglaz.astonbase.lesson9.decorator;

import com.iglaz.astonbase.lesson9.decorator.beverage.Beverage;
import com.iglaz.astonbase.lesson9.decorator.beverage.DarkRoast;
import com.iglaz.astonbase.lesson9.decorator.beverage.HouseBlend;
import com.iglaz.astonbase.lesson9.decorator.condiment.Mocha;
import com.iglaz.astonbase.lesson9.decorator.condiment.Soy;
import com.iglaz.astonbase.lesson9.decorator.condiment.Whip;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new DarkRoast(Beverage.Size.MIDDLE);
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());

        Beverage beverage2 = new HouseBlend(Beverage.Size.SMALL);
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + beverage2.cost());
    }
}
