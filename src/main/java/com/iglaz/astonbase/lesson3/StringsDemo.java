package com.iglaz.astonbase.lesson3;

public class StringsDemo {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";

        String hello3 = new String("Hello");
        String hello4 = new String("Hello");

        Byte int1 = 127;
        Byte int2 = 127;

        System.out.println(int1 == int2);

//        System.out.println(str1 == str2);
//        String intern3 = hello3.intern();
//        String intern4 = hello4.intern();
//
//        System.out.println(intern3 == intern4);
//        System.out.println(str1 == hello3);
    }
}
