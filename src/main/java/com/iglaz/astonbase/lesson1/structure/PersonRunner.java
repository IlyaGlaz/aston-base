package com.iglaz.astonbase.lesson1.structure;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonRunner {
    public static void main(String[] args) {
        int number = 22;

        Person ivan = new Person(434, "Aset");
        Person ivan3 = new Person();
        Person ivan2 = new Person();

//        Class<? extends Person> aClass = ivan.getClass();
//        Class<? extends Person> aClass1 = ivan3.getClass();
//        Class<Person> personClass = Person.class;
//
//        System.out.println(aClass1 == aClass);
//
//        Method[] methods = aClass1.getMethods();
//        Field[] fields = aClass1.getFields();

//        Method[] methods = aClass2.getMethods();
//        Field[] fields = aClass2.getFields();
//
//        System.out.println(aClass == aClass2);

//        some(22L);
    }

    static Person madeOldPerson() {
        return new Person(99, "Ivanich");
    }

    static void some(long num) {
        System.out.println(num);
    }
}
