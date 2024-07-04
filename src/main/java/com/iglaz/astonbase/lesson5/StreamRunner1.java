package com.iglaz.astonbase.lesson5;

import com.iglaz.astonbase.lesson2.object.Client;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamRunner1 {
    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(22, 244, 2432).stream()
//                .toList();
//
//        numbers.stream()
//                .filter((Integer integer) -> {
//                            return integer > 50;
//                        }
//                )
//                .map(integer -> String.valueOf(integer))
//                .forEach(System.out::println);

        List<Client> clients = List.of(new Client("aod", 22, List.of("sdom", "sdofm")),
                new Client("ads", 23, List.of("sdfa")));

        clients.stream()
                .map(client -> client.getFilms())
                .flatMap(list -> list.stream())
                .forEach(film -> System.out.println(film));


//        List<Integer> list = stream1.map(Client::getAge)
//                .toList();
//
//        List<Integer> list2 = stream1.map(Client::getAge)
//                .toList();
//
//
//        System.out.println(reduce);

    }
}
