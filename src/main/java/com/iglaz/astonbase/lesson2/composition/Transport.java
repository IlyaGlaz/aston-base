package com.iglaz.astonbase.lesson2.composition;

import com.iglaz.astonbase.lesson2.composition.driver.Driver;
import com.iglaz.astonbase.lesson2.composition.engine.Engine;

public class Transport {
    private Driver driver;
    private Engine engine;

    public Transport(Driver driver, Engine engine) {
        this.driver = driver;
        this.engine = engine;
    }

    void deliver(String destination, int cargo) {
        engine.move();
        driver.navigate();
    }
}
