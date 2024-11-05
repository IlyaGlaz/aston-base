package com.iglaz.astonbase.lesson5.optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Driver driver = new Driver();

        System.out.println(getModelOfCar(driver));
    }
    static String getModelOfCar(Driver driver) {
        Optional<Car> car = Optional.of(driver)
                .map(d -> d.getLicense())
                .map(l -> l.getCar());

        Car mers = car.orElse(new Car());

        Car car2 = car.orElseThrow();

        car.ifPresent(c -> c.setModel("BMW"));


        return "";
    }
}
