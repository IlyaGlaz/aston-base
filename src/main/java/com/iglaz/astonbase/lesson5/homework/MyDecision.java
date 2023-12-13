package com.iglaz.astonbase.lesson5.homework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MyDecision {
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

        System.out.println("Ex 1: " + allTransactionsFor2011(transactions));
        uniqueCities(transactions);
        System.out.println("Ex 3: " + allTradersFromCambridge(transactions));
        System.out.println("Ex 4: " + stringWithTradersNames(transactions));
        System.out.println("Ex 5: " + existTraderFromMilan(transactions));
        valueTradersTransactionsFromCambridge(transactions);
        System.out.println("Ex 7: " + maxValue(transactions));
        System.out.println("Ex 8: " + minValue(transactions));
    }

    //Exercise 1
    public static List<Transaction> allTransactionsFor2011(List<Transaction> list) {
        List<Transaction> transactions = list.stream()
                .filter(x -> x.getYear() == 2011)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .toList();

        return transactions;
    }

    //Exercise 2
    public static void uniqueCities(List<Transaction> list) {
        System.out.println("Ex 2: ");
        list.stream()
                .map(x -> x.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);
    }

    //Exercise 3
    public static List<Trader> allTradersFromCambridge(List<Transaction> list) {
        List<Trader> tradersFromCambridge = list.stream()
                .map(Transaction::getTrader)
                .filter(x -> x.getCity().equals("Cambridge"))
                .sorted(Comparator.comparing(Trader::getName))
                .distinct()
                .toList();
        return tradersFromCambridge;
    }

    //Exercise 4
    public static String stringWithTradersNames(List<Transaction> list) {
        String names = list.stream()
                .map(Transaction::getTrader)
                .sorted(Comparator.comparing(Trader::getName))
                .distinct()
                .map(Trader::getName)
                .collect(Collectors.joining(", "));

        return names;
    }

    //Exercise 5
    public static boolean existTraderFromMilan(List<Transaction> list) {
        Optional<Trader> trader = list.stream()
                .map(Transaction::getTrader)
                .filter(x -> x.getCity().equals("Milan"))
                .findAny();

        return trader.isPresent();
    }

    //Exercise 6
    public static void valueTradersTransactionsFromCambridge(List<Transaction> list) {
        System.out.println("Ex 6:");
        list.stream()
                .filter(x -> x.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);
    }

    //Exercise 7
    public static int maxValue(List<Transaction> list) {
        Optional<Integer> max =  list.stream()
                .max(Comparator.comparingInt(Transaction::getValue))
                .map(Transaction::getValue);

        return max.orElse(0);
    }

    //Exercise 8
    public static int minValue(List<Transaction> list) {
        Optional<Integer> min =  list.stream()
                .min(Comparator.comparingInt(Transaction::getValue))
                .map(Transaction::getValue);

        return min.orElse(0);
    }
}
