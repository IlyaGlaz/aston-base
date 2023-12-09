package com.iglaz.astonbase.lesson2.E;

public class Home {
    private String greeting = "Hi"; // Outer class instance variable

    protected class Room { // Inner class declaration
        public int repeat = 3;

        public void enter() {
            for (int i = 0; i < repeat; i++) greet(greeting);
        }

        private static void greet(String message) {
            System.out.println(message);
        }
    }
}
