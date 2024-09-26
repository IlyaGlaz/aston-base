package com.iglaz.astonbase.lesson6.exceptions;

import java.io.FileNotFoundException;

public class ExceptionRunner {
    public static void main(String[] args) {
        System.out.println("Before");

        processingInput(0);

        try {

            dangerMethod();

        } catch (InterruptedException | FileNotFoundException ex) {

        } catch (Exception ex) {

        } finally {

        }

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
