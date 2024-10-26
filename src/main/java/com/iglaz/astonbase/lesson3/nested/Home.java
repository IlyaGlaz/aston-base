package com.iglaz.astonbase.lesson3.nested;

public class Home {
    private final String greeting = "I am Home";// Outer class instance variable

    void printStat() {
        Room room = new Room();
        room.enter();
    }

    class Room {
        // Inner class declaration
        String nameOfTheRoom = "Dorm";

        private void enter() {
            System.out.println(greeting);
        }
    }
}
