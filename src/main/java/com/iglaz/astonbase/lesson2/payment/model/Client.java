package com.iglaz.astonbase.lesson2.payment.model;

import com.iglaz.astonbase.lesson7.deadlock.Account;

public class Client {
    private final int id;
    private final Account account;
    private final CreditCard card;

    public Client(int id, Account account, CreditCard card) {
        this.id = id;
        this.account = account;
        this.card = card;
    }

    public int getId() {
        return id;
    }

    public Account getAccount() {
        return account;
    }

    public CreditCard getCard() {
        return card;
    }
}
