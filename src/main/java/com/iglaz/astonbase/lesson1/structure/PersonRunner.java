package com.iglaz.astonbase.lesson1.structure;

public class PersonRunner {
    public static void main(String[] args) {
        Person person1 = new Person(24, "Dima");
        Person person2 = new Person(22, "Ivan");
        Person person3 = new Person();

        person1.sayHello();
        person2.sayHello();

        person2.setAge(23);
        person2.setName("Sema");

        Person old = Person.createOld();
    }
}
