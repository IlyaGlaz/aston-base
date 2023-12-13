package com.iglaz.astonbase.lesson5.homework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PuttingIntoPractice {

    public static void main(String... args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        //1. Найти все транзакции за 2011 год и отсортировать их по сумме (от меньшей
        // к большей).
        transactions.stream()
                .filter(x -> x.getYear() == 2011)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .forEach(System.out::println);

        //2. Вывести список неповторяющихся городов, в которых работают трейдеры.
        transactions.stream()
                .map(x->x.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

        //3. Найти всех трейдеров из Кембриджа и отсортировать их по именам.
        transactions.stream()
                .map(Transaction::getTrader)
                .distinct()
                .filter(x->x.getCity().equals("Cambridge"))
                .map(Trader::getName)
                .sorted()
                .forEach(System.out::println);
    }
}
