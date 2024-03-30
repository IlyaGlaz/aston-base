package com.iglaz.astonbase.lesson2.E;

public class HomeDemo {
    public static void main(String[] args) {
        Home home = new Home();

        Home.Room room = home.new Room();

        // Create the inner class instance
        System.out.println(room.nameOfTheRoom);

        PrivateHome.Room room1 = new PrivateHome.Room();
        PrivateHome.Room room2 = new PrivateHome.Room();
        PrivateHome.Room room3 = new PrivateHome.Room();
        room1.enter();
    }
}
