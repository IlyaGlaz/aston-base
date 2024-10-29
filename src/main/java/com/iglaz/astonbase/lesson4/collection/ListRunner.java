package com.iglaz.astonbase.lesson4.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListRunner {
    public static void main(String[] args) {
        List<String> friends = new ArrayList<>();

        friends.add(8, "");

        // добавить элемент
        friends.add("");
        friends.add("Sidorov");
        friends.add("Apina");
        friends.add("Sutkin");
        friends.add("Frodo");

        System.out.println(friends.size());

        // вставка элемента
        friends.add(5, "Gendalf");

        // получение элемента из коллекции
        System.out.println("Получение элемента " + friends.get(1));

        // коструктор с добавлением элементов из другой коллекции
        ArrayList<String> friendsSecond = new ArrayList<>(friends);

        System.out.println(friends);
        System.out.println(friends.size());

        // удалить элемент
        List<Integer> num = new ArrayList<>();

        System.out.println(friends.remove(0));
        System.out.println(friends.remove("Sutkin"));
        System.out.println(friends);

        // замена элемента по индексу
        friends.set(3, "Sokolov");
        System.out.println(friends);

        // очистка списка
        friends.clear();
        System.out.println(friends);

        // добавление нескольких элементов
        friends.addAll(friendsSecond);
        System.out.println(friends);

        // содержится ли элемент
        System.out.println(friends.contains("Ivanov"));

        // получить индекс элемента
        System.out.println(friends.indexOf("Frodo"));
        System.out.println(friends.get(1));

        for (String str : friends) {
            System.out.println(str.length());
        }
    }
}
