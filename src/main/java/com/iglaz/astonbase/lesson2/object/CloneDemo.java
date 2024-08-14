package com.iglaz.astonbase.lesson2.object;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Client ivan = new Client("Ivan", 22);
        ivan.addFilms("some film");

        Client cloneIvan = ivan.clone();
        Client cloneCloneIvan = new Client(cloneIvan);

        System.out.println(ivan);
        System.out.println(cloneIvan);

        cloneIvan.addFilms("other film");
        cloneIvan.setName("Vasya");

        System.out.println(ivan);
        System.out.println(cloneIvan);
        System.out.println(cloneCloneIvan);
    }
}
