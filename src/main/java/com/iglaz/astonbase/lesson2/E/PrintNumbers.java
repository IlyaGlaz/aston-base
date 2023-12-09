package com.iglaz.astonbase.lesson2.E;

public class PrintNumbers {
    private int length = 5;

    public void calculate() {
        final int width = 20;

        class Calculator {
            public void multiply() {
                System.out.print(length * width);
            }
        }

        var calculator = new Calculator();
        calculator.multiply();
    }
}
