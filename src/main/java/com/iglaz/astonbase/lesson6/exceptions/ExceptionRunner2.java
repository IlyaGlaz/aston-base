package com.iglaz.astonbase.lesson6.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionRunner2 {
    public static void main(String[] args) {

        int[] number = {};

//        try {
//
//            System.out.println(number[2]);
//
//        } catch(Exception c) {
//
//
//        }
//        try {
//            dangerMethod();
//        } catch(InterruptedException ex) {
//            ex.getCause();
//        } catch(Exception ex) {
//            ex.getMessage();
//        }

        try {
            dangerMethod();
            System.out.println("sdfffd");
        } catch(InterruptedException | FileNotFoundException ex) {
            ex.getLocalizedMessage();

        } finally {

        }

        System.out.println("After except");
    }

    static void dangerMethod() throws InterruptedException, FileNotFoundException {

        Thread.sleep(2000);

        FileInputStream res = new FileInputStream(new File("res"));


    }
}
