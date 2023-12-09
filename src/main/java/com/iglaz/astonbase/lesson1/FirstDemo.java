package com.iglaz.astonbase.lesson1;

import java.sql.DriverManager;

public class FirstDemo {
    public static void main(String[] args) {
        System.out.println(Object.class.getClassLoader());

        System.out.println(String.class.getClassLoader());

        System.out.println(DriverManager.class.getClassLoader());

        System.out.println(FirstDemo.class.getClassLoader());
    }
}
