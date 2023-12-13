package com.iglaz.astonbase.lesson5.homework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

        //1. Найти все транзакции за 2011 год и отсортировать их по сумме (от меньшей к большей).
        System.out.println(
                transactions.stream()
                        .filter(transaction -> transaction.getYear() == 2011)
                        .sorted(Comparator.comparingInt(Transaction::getValue))
                        .collect(Collectors.toList())
        );

        //2. Вывести список неповторяющихся городов, в которых работают трейдеры.
        System.out.println(
                transactions.stream()
                        .map(city -> city.getTrader().getCity())
                        .distinct()
                        .collect(Collectors.toList())
        );

        //3. Найти всех трейдеров из Кембриджа и отсортировать их по именам.
        System.out.println(
                transactions.stream()
                        .map(Transaction::getTrader)
                        .distinct()
                        .filter(city -> city.getCity().equals("Cambridge"))
                        .sorted(Comparator.comparing(Trader::getName))
                        .collect(Collectors.toList())
        );

        //4. Вернуть строку со всеми именами трейдеров, отсортированными в алфавитном порядке.
        System.out.println(
                transactions.stream()
                        .map(nameTraders -> nameTraders.getTrader().getName())
                        .distinct()
                        .sorted()
                        .collect(Collectors.toList())
        );

        //5. Выяснить, существует ли хоть один трейдер из Милана.
        System.out.println(
                transactions.stream()
                        .map(cityTraders -> cityTraders.getTrader().getCity())
                        .distinct()
                        .anyMatch(city -> city.equals("Milan"))
        );

        //6. Вывести суммы всех транзакций трейдеров из Кембриджа.
        System.out.println(
                transactions.stream()
                        .filter(city -> city.getTrader().getCity().equals("Cambridge"))
                        .map(Transaction::getValue)
                        .collect(Collectors.toList())
        );

        // 7. Какова максимальная сумма среди всех транзакций?
        System.out.println(
                transactions.stream()
                        .map(Transaction::getValue)
                        .reduce(Integer::max)
        );

        //8. Найти транзакцию с минимальной суммой.

        System.out.println(
                transactions.stream()
                        .min(Comparator.comparingInt(Transaction::getValue))
        );
    }
}
