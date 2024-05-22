package com.iglaz.astonbase.lesson2.object;

import java.util.List;

public class CloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Client ivan = new Client("Ivan", 22);
        ivan.addFilm("Hobbit");

        Client cloneIvan = ivan.clone();

        System.out.println(ivan);
        System.out.println(cloneIvan);

        cloneIvan.addFilm("Amile");

        System.out.println(cloneIvan);

        Client constrClone = new Client(ivan);
        System.out.println(constrClone);

        List<String> films = ivan.getFilms();
        films.add("asdfa");
    }
}
