package com.iglaz.astonbase.lesson1.structure;

public class PersonRunner {
    public static void main(String[] args) {
        int number = 22;

        Person person = new Person(44, "Ivan");
        Person person2 = new Person(22, "Max");

        person.sayHello();
        person2.sayHello();

        System.out.println(person.name = "Vanay");
        System.out.println(person.age);
    }
}
