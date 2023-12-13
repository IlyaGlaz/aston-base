package com.iglaz.astonbase.lesson5;

import com.iglaz.astonbase.lesson3.copy.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(new Person("Ivan", 22), new Person("Petor", 24));

        Collections.sort(list, (o1, o2) ->  o2.getAge().compareTo(o1.getAge()));
    }
}
