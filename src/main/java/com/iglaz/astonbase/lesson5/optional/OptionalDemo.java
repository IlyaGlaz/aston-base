package com.iglaz.astonbase.lesson5.optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Driver ivan = new Driver();

        if (ivan.getLicense() != null) {
            System.out.println(ivan.getLicense().getCar());
        }

        Car car = Optional.ofNullable(ivan.getLicense())
                .map(License::getCar)
//                .orElse(new Car())
                .orElseGet(Car::new);


//        if (maybeCar.isPresent()) {
//            maybeCar.get();
//        }
    }
}
