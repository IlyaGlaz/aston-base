package com.iglaz.astonbase.lesson3.copy;

public class CloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person ivan = new Person("Ivan", 22);
        ivan.addFilm("Операция Ы");
        System.out.println(ivan);

        Person clone = ivan.clone();
        System.out.println(clone.getName());
        System.out.println(clone.getAge());
        clone.addFilm("some film");

        System.out.println(ivan.getPreferFilms());

        Person goodCopy = new Person(ivan);
        goodCopy.addFilm("Other film");

        System.out.println(ivan.getPreferFilms());
        System.out.println(goodCopy.getPreferFilms());

    }
}
