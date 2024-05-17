package com.iglaz.astonbase.lesson2.copy;

import java.util.List;

public class PersonDemo {
    public static void main(String[] args) {
        Person ivan = new Person("Ivan", 22);
        ivan.addFilm("Операция Ы");

        List<String> preferFilms = ivan.getPreferFilms();
        preferFilms.add("Властелин колец");

        System.out.println(ivan.getPreferFilms());

        System.out.println(ivan.hashCode());
        System.out.println(ivan);
    }
}
