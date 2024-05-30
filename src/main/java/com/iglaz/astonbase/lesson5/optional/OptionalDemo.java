package com.iglaz.astonbase.lesson5.optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Driver driver = new Driver();
//
//        System.out.println(driver.getLicense().getCar());

        Car car = Optional.of(driver)
                .map(Driver::getLicense)
                .map(License::getCar)
                .orElse(new Car());

        Optional.of(driver)
                .map(Driver::getLicense)
                .map(License::getCar)
                .orElseThrow();

        Optional.of(driver)
                .map(Driver::getLicense)
                .map(License::getCar)
                .orElseGet(() -> new Car());

        Optional.of(driver)
                .map(Driver::getLicense)
                .map(License::getCar)
                .ifPresent(x -> car.setModel("sdr"));

        System.out.println(car);

//        if (maybeLicense.isPresent()) {
//            System.out.println(maybeLicense.get().getCar());
//        }

//        if (driver.getLicense() != null) {
//            System.out.println(driver.getLicense().getCar());
//        }
    }
}
