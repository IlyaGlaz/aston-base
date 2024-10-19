package com.iglaz.astonbase.lesson1.classloaders;

import java.sql.DriverManager;

public class ClassLoadersDemo {
    public static void main(String[] args) {
        Class<ClassLoadersDemo> clazz = ClassLoadersDemo.class;

        System.out.println(Object.class.getClassLoader());
        System.out.println(String.class.getClassLoader());

        System.out.println(DriverManager.class.getClassLoader());

        System.out.println(ClassLoadersDemo.class.getClassLoader());
    }
}
