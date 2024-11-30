package com.iglaz.astonbase.lesson5.homework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PuttingIntoPractice {

    final static int YEAR_2011 = 2011;
    final static String CITY_CAMBRIDGE = "Cambridge";
    final static String MILAN_CITY = "Milan";
    final static String CITY_TRANSACTION = "Cambridge";

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

        // 1. Найти все транзакции за 2011 год и отсортировать их по сумме (от меньшей к большей).

        List<Transaction> listResult = transactions.stream()
                .filter(t -> t.getYear() == YEAR_2011)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .toList();

        System.out.println("Все транзакции за 2011 год, отсортированные их по сумме (от меньшей к большей)\n" + listResult);


        // 2. Вывести список неповторяющихся городов, в которых работают трейдеры.
        List<String> listCities = transactions.stream()
                .map(t -> t.getTrader().getCity())
                .distinct()
                .toList();

        System.out.println("Cписок неповторяющихся городов, в которых работают трейдеры:\n" + listCities);


        // 3. Найти всех трейдеров из Кембриджа и отсортировать их по именам.
        List<Trader> listTraders = transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals(CITY_CAMBRIDGE))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .toList();

        System.out.println("Все трейдеры из Кембриджа и отсортировать их по именам.\n" + listTraders);


        // 4. Вернуть строку со всеми именами трейдеров, отсортированными в алфавитном
        //порядке.
        String stringTrader = transactions.stream()
                .map(Transaction::getTrader)
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .map(Trader::getName)
                .collect(Collectors.joining(", "));

        System.out.println("Cтрока со всеми именами трейдеров, отсортированными в алфавитном порядке.\n" + stringTrader);


        // 5. Выяснить, существует ли хоть один трейдер из Милана.
        boolean containsTraderMilana = transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals(MILAN_CITY));

        System.out.println("Cуществует ли хоть один трейдер из Милана: " + (containsTraderMilana ? "Cуществует" : "Не cуществует"));


        // 6. Вывести суммы всех транзакций трейдеров из Кембриджа.
        int sumTransaction = transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals(CITY_TRANSACTION))
                .map(Transaction::getValue)
                .reduce(0, Integer::sum);

        System.out.println("Cумма всех транзакций трейдеров из Кембриджа: " + sumTransaction);


        // 7. Какова максимальная сумма среди всех транзакций?
        int maxSumFromAllTransaction = transactions.stream()
                .map(Transaction::getValue)
                .max(Integer::compareTo).get();

        System.out.println("Максимальная сумма среди всех транзакций: " + maxSumFromAllTransaction);

        // 8. Найти транзакцию с минимальной суммой.
        int minSumFromAllTransaction = transactions.stream()
                .map(Transaction::getValue)
                .min(Integer::compareTo).get();

        System.out.println("Транзакция с минимальной суммой: " + minSumFromAllTransaction);
    }
}
