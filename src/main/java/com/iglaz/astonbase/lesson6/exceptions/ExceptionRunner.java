package com.iglaz.astonbase.lesson6.exceptions;

import java.io.IOException;
import java.sql.SQLDataException;
import java.util.ArrayList;
import java.util.List;

public class ExceptionRunner {
    public static void main(String[] args) {
        System.out.println("Befro");

        List<String> str = new ArrayList<>();

        try {
            str.get(10);

            System.out.println("After");
        } catch(IndexOutOfBoundsException e) {
            System.out.println(e.getLocalizedMessage());
        }


        System.out.println("After");
    }

    static void notSafeDeletion1(int number) {
        try {
            System.out.println(9 / number);
        } catch (ArithmeticException exception) {
//            throw new UserNotFoundException(exception);
//            log.error(());
//            exception.getMessage();
//            exception.printStackTrace();
        }
    }

    static void dangerMethod() throws SQLDataException, IOException {
        throw new IOException();

//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException ex) {
//            throw new RuntimeException(ex);
//        }
    }

//    static void notSafeDeletion2(int number) {
//
//        notSafeDeletion3(number);
//
//    }
//
//    static void notSafeDeletion3(int number) {
//
//        notSafeDeletion4(number);
//
//    }
//
//    static void notSafeDeletion4(int number) {
//
//        System.out.println(9 / number);
//
//    }
}
