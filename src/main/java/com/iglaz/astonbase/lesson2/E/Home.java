package com.iglaz.astonbase.lesson2.E;

public class Home {
    private final String greeting = "I am Home";// Outer class instance variable

    void printStat() {
        Room room = new Room();
    }

    class Room {
        // Inner class declaration
        String nameOfTheRoom = "Dorm";

        public void enter() {
            System.out.println(greeting);
        }
    }
}
