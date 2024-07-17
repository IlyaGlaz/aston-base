package com.iglaz.astonbase.lesson9.decorator.beverage;

public abstract class Beverage {

    public enum Size { BIG, MIDDLE, SMALL };
    protected double price;
    protected Size size;
    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract double cost();
}
