package streamAPI;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PuttingIntoPracticeByLednyov {

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

        System.out.println("Найти все транзакции за 2011 год и отсортировать их по сумме (от меньшей к большей)");

        transactions.stream()
                .filter(x -> x.getYear() == 2011)
                .map(Transaction::getValue)
                .sorted()
                .forEach(System.out::println);

        System.out.println("Вывести список неповторяющихся городов, в которых работают трейдеры");

        transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("Найти всех трейдеров из Кембриджа и отсортировать их по именам");

        transactions.stream()
                .map(Transaction::getTrader)
                .filter(x -> x.getCity().equals("Cambridge"))
                .map(Trader::getName)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        System.out.println("Вернуть строку со всеми именами трейдеров, отсортированными в алфавитном порядке");

        transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .distinct()
                .sorted()
                .forEach(x -> System.out.print(x + " "));

        System.out.println();
        System.out.println("Выяснить, существует ли хоть один трейдер из Милана");

        transactions.stream()
                .map(Transaction::getTrader)
                .filter(x -> x.getCity() == "Milan")
                .limit(1)
                .forEach(x -> System.out.println("True"));

        System.out.println("Вывести суммы всех транзакций трейдеров из Кембриджа");

        transactions.stream()
                .filter(x -> x.getTrader().getCity() == "Cambridge")
                .map(Transaction::getValue)
                .forEach(System.out::println);

        System.out.println("Какова максимальная сумма среди всех транзакций?");

        System.out.println(transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::max));

        System.out.println("Найти транзакцию с минимальной суммой");

        System.out.println(transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::min));
    }
}
