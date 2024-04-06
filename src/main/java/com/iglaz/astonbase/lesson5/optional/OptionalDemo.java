package com.iglaz.astonbase.lesson5.optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Car car = Optional.ofNullable(driver.getLicense())
                .map(License::getCar)
                .orElse(new Car());

        Car car2 = Optional.ofNullable(driver.getLicense())
                .map(License::getCar)
                .orElseGet(() -> new Car());

//        Car car3 = Optional.ofNullable(driver.getLicense())
//                .map(License::getCar)
//                .orElseThrow();
//
        Optional.ofNullable(driver.getLicense())
                .map(License::getCar)
                .ifPresent(carcar -> carcar.setModel("Benz"));

//        if (mayberCar.isPresent()) {
//            mayberCar.get();
//        }

//        if (driver.getLicense() != null) {
//            System.out.println(driver.getLicense().getCar());
//        }

    }
}
