package com.iglaz.astonbase.lesson5.optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Optional.of(driver)
                .map(Driver::getLicense)
                .map(License::getCar)
                .filter(c -> c.getModel().equals("Mers"))
                .ifPresent(c -> c.setModel("Beha"));
    }
}
