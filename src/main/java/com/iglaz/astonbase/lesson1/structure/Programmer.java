package com.iglaz.astonbase.lesson1.structure;

public class Programmer extends Person {
    String lang;

    public Programmer(int age, String name, String lang) {
        super(age, name);
        this.lang = lang;
    }

    @Override
    void sayHello(int... num) {
        System.out.println("Introvet");
    }

    void sayHello(String str1) {
        System.out.println();
    }
}


