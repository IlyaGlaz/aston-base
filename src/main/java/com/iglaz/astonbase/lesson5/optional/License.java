package com.iglaz.astonbase.lesson5.optional;

public class License extends Car {
    private String model;
    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
