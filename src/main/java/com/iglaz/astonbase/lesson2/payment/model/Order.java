package com.iglaz.astonbase.lesson2.payment.model;

public class Order {
    private final double price;

    public Order(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
