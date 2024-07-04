package com.iglaz.astonbase.lesson1.structure;

public class PersonRunner {
    public static void main(String[] args) {
        Person person1 = new Person(23, "Ivan");
        Person person2 = new Person(23, "Ivan");

        System.out.println(person1.equals(person2));

        System.out.println(person1);

//        Person person = new Person();
//
//        String str1 = "23412";
//        str1 = str1 + "1";
//
//        String name = person.getName();
//        System.out.println(name.length());
//        System.out.println(person);
//
//        Programmer programmer = new Programmer(22, "Bloch", "Java");
//        programmer.sayHello();
//
//        Person.getCounter();
    }
}
