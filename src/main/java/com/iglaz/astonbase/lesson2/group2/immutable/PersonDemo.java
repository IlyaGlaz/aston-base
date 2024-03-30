package com.iglaz.astonbase.lesson2.group2.immutable;

import java.util.List;

public class PersonDemo {
    public static void main(String[] args) {
        Person ivan = new Person("Ivan", 30);
        List<String> preferFilms = ivan.getPreferFilms();

        preferFilms.add("ADF");
    }
}
