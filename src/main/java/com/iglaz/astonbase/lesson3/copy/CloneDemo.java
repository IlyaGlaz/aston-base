package com.iglaz.astonbase.lesson3.copy;

public class CloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person ivan = new Person("Ivan", 22);
        ivan.addFilm("33");

        System.out.println(ivan);

        Person clonePerson = (Person) ivan.clone();
        clonePerson.addFilm("someFilm");

        System.out.println(clonePerson);
        System.out.println(ivan);
    }
}
