package com.iglaz.astonbase.lesson2.object;

public class ComparisonDemo {
    public static void main(String[] args) {
        int num1 = 124;
        int num2 = 124;
        int num3 = 500;

        System.out.println(num1 == num2);
        System.out.println(num1 == num3);

        Client maxim = new Client("Maxim", 30);
        System.out.println(maxim);

        Client maximus = maxim;
        Client ivan = new Client("Maxim", 30);

        System.out.println(maxim.equals(maximus));
        System.out.println(maxim == maximus);
        System.out.println(maxim.equals(ivan));
        System.out.println(maxim.hashCode() + " " + ivan.hashCode());
        System.out.println(maxim == ivan);
    }
}
