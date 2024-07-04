package com.iglaz.astonbase.lesson6.exceptions;

import java.io.IOException;

public class ExceptionRunner4 {
    public static void main(String[] args) {
//        int[] ints = {};
//
//        System.out.println(ints[6]);
        System.out.println("Start");


        try {
            danger();

            math(0);

            System.out.println("in try block");
        } catch (InterruptedException ex) {
            throw new UserNotFoundException(ex);
        } catch (RuntimeException ex) {
            System.out.println("Деление на 0");
        } catch (IOException ex) {
            System.out.println("IO");
        } catch (Exception ex) {
            System.out.println("");
        } finally {
            System.out.println("In finally");
        }


        System.out.println("At the End");

//        try {
//            danger();
//        } catch (InterruptedException | IOException ex) {
//            System.out.println("");
//        }
    }

    static void danger() throws InterruptedException, IOException {

//        try {

        Thread.sleep(1000);

//        } catch(InterruptedException ex) {
//            System.out.println(ex);
//
//            ex.getStackTrace();
//        }
    }

    static void math(int number) {

//        try {
            System.out.println(200 / number);
//        } catch(ArithmeticException ex) {
//            System.out.println("Нельзя делить на 0, введите другое число");
//        }
    }
}
