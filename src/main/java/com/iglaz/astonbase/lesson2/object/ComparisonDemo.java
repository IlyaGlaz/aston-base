package com.iglaz.astonbase.lesson2.object;

public class ComparisonDemo {
    public static void main(String[] args) {
//        int num1 = 124;
//        int num2 = 124;
//
//        System.out.println(num1 == num2);

        Client maxim = new Client("Max", 30);
        Client ivan = new Client("Max", 30);
        Client other = ivan;

//        System.out.println(maxim == ivan);
        System.out.println(ivan.equals(other));
        System.out.println(ivan == other);
    }
}
