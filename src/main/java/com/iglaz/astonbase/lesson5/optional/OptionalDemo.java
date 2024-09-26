package com.iglaz.astonbase.lesson5.optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Driver driver = new Driver();

        System.out.println(getModelOfCar(driver));
    }

    static String getModelOfCar(Driver driver) {
        Optional<Car> maybeModel = Optional.of(driver)
                .map(driver1 -> driver1.getLicense())
                .map(license -> license.getCar());

//        String model = "";
//        if (maybeModel.isPresent()) {
//            model = maybeModel.get();
//        }

        maybeModel.ifPresent(car -> car.setModel("Mers"));

//        return maybeModel.orElse(null);

//        return maybeModel.orElseThrow();

        return maybeModel.map(Car::getModel).orElse("");
    }
}
