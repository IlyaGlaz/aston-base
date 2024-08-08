package com.iglaz.astonbase.lesson1.structure;

public class PersonRunner {
    public static void main(String[] args) {
        int number = 22;

        Person ivan = new Person();
        Person ivan3 = new Person();
        Person ivan2 = new Person();

        some(22L);
    }

    static Person madeOldPerson() {
        return new Person(99, "Ivanich");
    }

    static void some(long num) {
        System.out.println(num);
    }
}
