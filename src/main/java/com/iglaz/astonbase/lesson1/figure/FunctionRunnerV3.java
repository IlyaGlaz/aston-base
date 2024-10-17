package com.iglaz.astonbase.lesson1.figure;

public class FunctionRunnerV3 {
    public static void main(String[] args) {
        System.out.println(
                circumference(5.12) * circumference(4.44)
        );

    }

    public static double circumference(double radius) {
        return 2 * 3.14 * radius;
    }
}
