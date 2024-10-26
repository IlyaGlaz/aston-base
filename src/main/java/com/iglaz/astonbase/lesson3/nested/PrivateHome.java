package com.iglaz.astonbase.lesson3.nested;

public class PrivateHome {
    private static String str;
    private String str2;

    private void print() {
        Room room = new Room();
    }

    static class Room { // nested class declaration
        public int repeat = 3;

        public void enter() {
            System.out.println();
            System.out.println();

            PrivateHome privateHome = new PrivateHome();
            privateHome.print();
            for (int i = 0; i < repeat; i++) {
                System.out.println(str);
            }
        }
    }
}
