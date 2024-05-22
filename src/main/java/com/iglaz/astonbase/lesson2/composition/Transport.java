package com.iglaz.astonbase.lesson2.composition;

import com.iglaz.astonbase.lesson2.composition.driver.Driver;
import com.iglaz.astonbase.lesson2.composition.engine.Engine;

public abstract class Transport {
    private Driver driver;
    private Engine engine;

    void deliver(String destination, int cargo) {

    }
}
