package com.iglaz.astonbase.lesson2.object;

public class CloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Client ivan = new Client("Ivan", 22);
        ivan.addFilms("some film");
        Client copy = ivan.copy(44);

        Client cloneIvan = ivan.clone();

        System.out.println(ivan);
        System.out.println(cloneIvan);

        cloneIvan.addFilms("other film");

        System.out.println(ivan);
        System.out.println(cloneIvan);
        System.out.println(copy);
    }
}
