package com.iglaz.astonbase.lesson6.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Path;
import java.sql.SQLDataException;

public class ExceptionRunner {
    public static void main(String[] args) {
        System.out.println("Welcome to program");

        notSafeDeletion1(0);

        try (FileInputStream fileInputStream = new FileInputStream(Path.of("").toFile());
             FileOutputStream outputStream = new FileOutputStream(Path.of("").toFile())) {

            dangerMethod();
            System.out.println("Внутри метода");

            fileInputStream.read();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SQLDataException e) {
            throw new RuntimeException(e);
        }

        System.out.println("After deletion");
        System.out.println("After deletion");
        System.out.println("After deletion");
        System.out.println("After deletion");
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
