package com.iglaz.astonbase.lesson1.structure;

public class PersonRunner {
    public static void main(String[] args) {
        Person person1 = new Person(22, "Ivan");
        Person person2 = new Person(42, "Maxim");
        Person person3 = new Person(22, "Ivan");

        System.out.println(person1.getAge());

        int number = 22;
    }
}
