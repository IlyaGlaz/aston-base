package com.iglaz.astonbase.lesson1;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PersonRunner {
    public int count;

    public static void main(String[] args) {
        final int num = 22;

        List<String> str = new LinkedList<>();

        Person person = new Person(22, "ASDF");
        System.out.println(person);

        Math.abs(2);

//        person.setAge(22);
//        person.setName("Hello");
//
//        Math.pow(2.0, 2.0);
//        System.out.println(Person.NAME);
    }

    public List<String> getList(List<String> str2) {
        return new ArrayList<>();
    }
}
