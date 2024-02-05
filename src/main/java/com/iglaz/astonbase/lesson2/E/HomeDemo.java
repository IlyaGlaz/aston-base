package com.iglaz.astonbase.lesson2.E;

public class HomeDemo {
    public static void main(String[] args) {
        Home home = new Home();

        Home.Room room = home.new Room(); // Create the inner class instance
        home = null;
        room.enter();

//        PrivateHome.Room room1 = new PrivateHome.Room();
//        room1.enter();
    }
}
