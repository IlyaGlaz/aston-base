package com.iglaz.astonbase.lesson1.stack;

public class StackRunner {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start");
        func1();
        for (int i = 0; i < 200; i++) {

            Thread.sleep(10000);
        }


        System.out.println("Program finish");
    }

    static void func1() {
        int num = 10;
        System.out.println("In func1");
        func2();
    }

    static void func2() {
        func3();
    }

    static void func3() {
        System.out.println("In func3");
        func4();
    }

    static void func4() {
        System.out.println("In func4");
        func5();
    }

    static void func5() {
        System.out.println("In func5");
    }
}
