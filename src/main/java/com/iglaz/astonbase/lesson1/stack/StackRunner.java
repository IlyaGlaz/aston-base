package com.iglaz.astonbase.lesson1.stack;

public class StackRunner {
    public static void main(String[] args) {
        System.out.println("Start");

        func1();

        System.out.println("Program finish");
    }

    static void func1() {
        int num = 10;
        System.out.println("Begin func1");
        func2();
        System.out.println("Quitting func1");
    }

    static void func2() {
        System.out.println("Begin func2");
        func3();
        System.out.println("Quitting func2");
    }

    static void func3() {
        System.out.println("Begin func3");
        func4();
        System.out.println("Quitting func3");
    }

    static void func4() {
        System.out.println("Begin func4");
        func5();
        System.out.println("Quitting func4");
    }

    static void func5() {
        System.out.println("Begin func5");
        System.out.println("Quitting func5");
    }
}
