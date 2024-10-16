package com.iglaz.astonbase.lesson1.figure;

public class FunctionRunnerV3 {
    public static void main(String[] args) {
       circumference(5.12);
       circumference(2.24);
       circumference(5.55);
       circumference(5.12);

        double radius1 = 5.12;
        double circumferenceValue = 2 * 3.14 * radius1;

        System.out.println(circumferenceValue);

    }

    public static double circumference(double radius) {
        return 2 * 3.14 * radius;
    }
}
