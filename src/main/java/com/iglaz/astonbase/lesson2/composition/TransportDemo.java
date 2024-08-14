package com.iglaz.astonbase.lesson2.composition;

import com.iglaz.astonbase.lesson2.composition.driver.Human;
import com.iglaz.astonbase.lesson2.composition.driver.Robot;
import com.iglaz.astonbase.lesson2.composition.engine.ElectircEngine;

public class TransportDemo {
    public static void main(String[] args) {
        Transport transport = new Transport(new Robot(), new ElectircEngine());
        Transport transport1 = new Transport(new Human(), new ElectircEngine());
    }
}
