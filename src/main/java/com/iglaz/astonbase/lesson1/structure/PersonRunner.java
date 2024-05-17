package com.iglaz.astonbase.lesson1.structure;

import java.util.Arrays;

public class PersonRunner {
    public static void main(String[] args) {
        Person person1 = new Person(23, "Ivan");
        Person person2 = new Person(42, "Maxim");
        Person person3 = new Person(22, "Ivan");

        person3.setAge(55);

        System.out.println(person1.getAge());
        Person.sayHello();

        Class<Person> personClass = Person.class;
        personClass.getClassLoader();
        System.out.println(Arrays.toString(personClass.getFields()));
    }
}
