package com.iglaz.astonbase.lesson2.E;

public class HomeDemo {
    public static void main(String[] args) {
        var home = new Home();
        Home.Room room = home.new Room(); // Create the inner class instance
    }
}
