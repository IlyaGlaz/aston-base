package com.iglaz.astonbase.lesson2.object;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Client ivan = new Client("Ivan", 22);
        Client elem = new Client("Inside", 100);

        Client cloneIvan = ivan.clone();

        System.out.println(ivan);
        System.out.println(cloneIvan);

        System.out.println(ivan);
        System.out.println(cloneIvan);


        System.out.println(ivan.getFilms().get(0));
//
//        Client constrClone = new Client(ivan);
//        System.out.println(constrClone);
//
//        List<String> films = ivan.getFilms();
//        films.add("asdfa");
//
//        List<Client> list = Arrays.asList(new Client("Ivanov", 45), new Client("Petronv", 11));
//
//        Collections.sort(list);
//
//        System.out.println(list);
    }
}
