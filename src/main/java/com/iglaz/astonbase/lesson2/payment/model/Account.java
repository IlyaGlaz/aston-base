package com.iglaz.astonbase.lesson2.payment.model;

import java.time.LocalDate;

public class Account {
    private final LocalDate lastWithdrow;

    public Account(LocalDate lastWithdrow) {
        this.lastWithdrow = lastWithdrow;
    }
}
