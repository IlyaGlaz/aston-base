package com.iglaz.astonbase.lesson7.wait;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class
CashboxRunner {

    public static void main(String[] args) throws InterruptedException {
        Queue<Cashbox> cashboxes = new ArrayDeque<>(List.of(new Cashbox(), new Cashbox()));

        Thread thread1 = new Thread(new BuyerThread(cashboxes));
        Thread thread2 = new Thread(new BuyerThread(cashboxes));
        Thread thread3 = new Thread(new BuyerThread(cashboxes));
        Thread thread4 = new Thread(new BuyerThread(cashboxes));
        Thread thread5 = new Thread(new BuyerThread(cashboxes));
        Thread thread6 = new Thread(new BuyerThread(cashboxes));
        Thread thread7 = new Thread(new BuyerThread(cashboxes));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        thread5.join();
        thread6.join();
        thread7.join();
    }
}
