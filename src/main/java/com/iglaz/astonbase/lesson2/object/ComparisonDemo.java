package com.iglaz.astonbase.lesson2.object;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparisonDemo {
    public static void main(String[] args) {
//        int num1 = 124;
//        int num2 = 124;
//        int num3 = 500;
//
//        System.out.println(num1 == num2);
//        System.out.println(num1 == num3);
//
//        Client maxim = new Client("Maxim", 30);
//        System.out.println(maxim);
//
//        Client maximus = maxim;
//        Client ivan = new Client("Maxim", 30);
//
//        System.out.println(maxim.equals(maximus));
//        System.out.println(maxim == maximus);
//        System.out.println(maxim.equals(ivan));
//        System.out.println(maxim.hashCode() + " " + ivan.hashCode());
//        System.out.println(maxim == ivan);

        List<Client> list = Arrays.asList(new Client("Ivan", 50), new Client("Ivan", 25));
        System.out.println(list);

        Comparator<Client> nameComparator = new Comparator<>() {

            @Override
            public int compare(Client o1, Client o2) {
                return o1.getName().compareTo(o2.getName());
            }

        };

        Collections.sort(list, nameComparator);


        System.out.println(list);
    }
}
