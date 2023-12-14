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

        System.out.println("Все транзакции за 2011 год, отсортированные по их сумме:");
        transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .forEach(System.out::println);

        System.out.println("\nСписок неповторяющихся городов, в которых работают трейдеры:");
        transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .forEach(System.out::println);

        System.out.println("\nВсе трейдеры из Кембриджа, отсортированные по именам:");
        transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .map(Trader::getName)
                .sorted()
                .forEach(System.out::println);

        System.out.println("\nСтрока со всеми именами трейдеров, отсортированными в алфавитном порядке:");
        String traders = transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .sorted()
                .collect(Collectors.joining(", "));
        System.out.println(traders);

        System.out.println("\nСуществует ли хоть один трейдер из Милана?");
        boolean isExist = transactions.stream()
                .map(Transaction::getTrader)
                .anyMatch(trader -> trader.getCity().equals("Milan"));
        System.out.println(isExist ? "Да." : "Нет.");

        System.out.println("\nСуммы всех транзакций трейдеров из Кембриджа:");
        /*
        это общая сумма, так как изначально невнимательно прочитала задание :)

        int sum = transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .mapToInt(Transaction::getValue)
                .sum();
         */
        transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .mapToInt(Transaction::getValue)
                .forEach(System.out::println);

        System.out.println("\nМаксимальная сумма среди всех транзакций:");
        int maxSum = transactions.stream().mapToInt(Transaction::getValue).max().getAsInt();
        System.out.println(maxSum);
    }
}
