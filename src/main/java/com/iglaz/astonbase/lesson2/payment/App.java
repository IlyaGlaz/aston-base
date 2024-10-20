package com.iglaz.astonbase.lesson2.payment;

import com.iglaz.astonbase.lesson2.payment.logic.PaymentService;
import com.iglaz.astonbase.lesson2.payment.model.Client;
import com.iglaz.astonbase.lesson2.payment.model.CreditCard;
import com.iglaz.astonbase.lesson2.payment.model.Order;
import com.iglaz.astonbase.lesson7.deadlock.Account;

public class App {
    public static void main(String[] args) {
        Client client = new Client(1, new Account(100), new CreditCard("1-1-1-1", 500.0));
        Order order = new Order(50.0);

        PaymentService.payForOrder(client, order);
    }
}
