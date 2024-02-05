package com.iglaz.astonbase.lesson1;

public class PersonRunner {
    public static void main(String[] args) {

        Person person = new Person(22, "Hello");
        Person person1 = new Person(22, "Hello");
        System.out.println(person.hashCode());
        System.out.println(person1.hashCode());

//        person.setAge(22);
//        person.setName("Hello");
//
//        Math.pow(2.0, 2.0);
//        System.out.println(Person.NAME);
//
        Class<? extends Person> aClass = person.getClass();

        System.out.println(aClass instanceof Class);
    }
}
