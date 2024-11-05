package com.iglaz.astonbase.lesson6.exceptions;

import java.io.FileNotFoundException;

public class ExceptionRunner {
    public static void main(String[] args) {
        System.out.println("Before");
//
//        String str = null;
//        str.length();
//
        System.out.println("After");
    }

    static void processingInput(int number) {
        try {
            System.out.println(100 / number);
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
    }

    static void dangerMethod() throws InterruptedException, FileNotFoundException {

        Thread.sleep(1000);

    }
}
