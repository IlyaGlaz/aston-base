package com.iglaz.astonbase.lesson6.exceptions;

public class ExceptionRunner3 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Befor");

        try {
            System.out.println(22 / 0);

            System.out.println("Inside block");
        } catch (ArithmeticException | NullPointerException ex) {
            System.out.println(ex.getLocalizedMessage() + "Делить на 0 нельзя");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(ex.getStackTrace());
        } catch (Exception ex) {
            System.out.println(ex.getLocalizedMessage() + "Делить на 0 нельзя");

            System.out.println("After");
        }

        dangerMethod();
    }

    static void dangerMethod() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            throw new UserNotFoundException(ex);
        }
    }
}
