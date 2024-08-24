package com.iglaz.astonbase.lesson6.exceptions;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class ExceptionRunner {
    public static void main(String[] args) {
        System.out.println("Before");

        List<String> str = new ArrayList<>();

        try {
            int i = Integer.parseInt("sdfsdf");

            System.out.println("In try");
        } catch (NumberFormatException ex) {
            System.out.println("Bad format");
        }

        System.out.println("After");

        try {
            dangerMethod();
        } catch (InterruptedException exception) {
            throw new RuntimeException(exception);
        } catch (FileNotFoundException exception) {
            exception.getMessage();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    static void dangerMethod() throws InterruptedException, FileNotFoundException {
        
        Thread.sleep(1000);

    }
}
