package com.iglaz.astonbase.lesson2.E;

import java.util.Comparator;

public class LocalClass {
    public static void main(String[] args) {
//        class MyLocalClass {
//            int number;
//        }
//
//        MyLocalClass myLocalClass = new MyLocalClass();


        Comparator comparator = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };


    }
}
