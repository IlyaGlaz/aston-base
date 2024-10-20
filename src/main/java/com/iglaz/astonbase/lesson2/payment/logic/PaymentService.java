package com.iglaz.astonbase.lesson2.payment.logic;

import com.iglaz.astonbase.lesson2.payment.model.Client;
import com.iglaz.astonbase.lesson2.payment.model.CreditCard;
import com.iglaz.astonbase.lesson2.payment.model.Order;

public final class PaymentService {

    private PaymentService() {}

    public static boolean payForOrder(Client client, Order order) {
        CreditCard card = client.getCard();
        double price = order.getPrice();

        if (card.getAmount() > price) {
            card.setAmount(card.getAmount() - price);
            return true;
        } else {
            System.out.println("Не хватает денег");
            return false;
        }
    }

    public static void blockCard(CreditCard card) {
        if (card.isExpired()) {
            System.out.println("Карта заблокирована");
        }
    }
}
