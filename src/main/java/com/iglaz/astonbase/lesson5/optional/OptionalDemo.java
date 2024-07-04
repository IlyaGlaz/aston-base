package com.iglaz.astonbase.lesson5.optional;


import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Driver driver = new Driver();

//        Car car = Optional.ofNullable(driver.getLicense())
//                .map(license1 -> license1.getCar())
//                .orElse(null);

//        Car car1 = Optional.ofNullable(driver.getLicense())
//                .map(license1 -> license1.getCar())
//                .orElseThrow();

//        boolean present = Optional.ofNullable(driver.getLicense())
//                .map(license1 -> license1.getCar())
//                .isPresent();

        Optional.ofNullable(driver.getLicense())
                .map(license1 -> license1.getCar())
                .ifPresent(car1 -> car1.setModel("Mers"));

//        System.out.println(present);

//        optionalLicense.get().getCar();

//        if (license != null) {
//            System.out.println(license.getCar());
//        }
    }
}
