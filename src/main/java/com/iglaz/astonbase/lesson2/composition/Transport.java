package com.iglaz.astonbase.lesson2.composition;

import com.iglaz.astonbase.lesson2.composition.driver.Driver;
import com.iglaz.astonbase.lesson2.composition.engine.ElectircEngine;
import com.iglaz.astonbase.lesson2.composition.engine.Engine;

public class Transport {
    private Driver driver;
    private Engine engine = new ElectircEngine();

    public Transport(Driver driver, Engine engine) {
        this.driver = driver;
        this.engine = engine;
    }

    void deliver(String destination, int cargo) {
        engine.move();
    }
}
