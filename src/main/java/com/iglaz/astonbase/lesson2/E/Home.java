package com.iglaz.astonbase.lesson2.E;

public class Home {
    private static String str;
    private String greeting = "Hi"; // Outer class instance variable

    class Room { // Inner class declaration
        public int repeat = 3;
        public String greeting = "Bye";

        public void enter() {

            System.out.println(Home.this.greeting);
            for (int i = 0; i < repeat; i++) {

                System.out.println(greeting);

            }
        }
    }
}
