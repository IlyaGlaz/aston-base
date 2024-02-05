package com.iglaz.astonbase.lesson2.E;

public class PrivateHome {
    private static String str;
    public String greeting = "Hi"; // Outer class instance variable

    private void print() {
        System.out.println("");
    }

    static class Room { // nested class declaration
        public int repeat = 3;

        public void enter() {

            PrivateHome privateHome = new PrivateHome();
            privateHome.print();
            for (int i = 0; i < repeat; i++) {
                System.out.println(str);
            }
        }
    }
}
