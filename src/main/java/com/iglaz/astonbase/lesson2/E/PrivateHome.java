package com.iglaz.astonbase.lesson2.E;

public class PrivateHome {
    private static String str;

    private void print() {
        Room room = new Room();
    }

    static class Room { // nested class declaration
        public int repeat = 3;

        public void enter() {
            System.out.println(str);
            System.out.println();

            PrivateHome privateHome = new PrivateHome();
            privateHome.print();
            for (int i = 0; i < repeat; i++) {
                System.out.println(str);
            }
        }


    }
}
