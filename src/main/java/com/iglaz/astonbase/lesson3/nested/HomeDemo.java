package com.iglaz.astonbase.lesson3.nested;

public class HomeDemo {
    public static void main(String[] args) {
        Home.Room room = new Home().new Room();

        System.out.println();

        PrivateHome.Room room1 = new PrivateHome.Room();
        PrivateHome.Room room4 = new PrivateHome.Room();
        PrivateHome.Room room3 = new PrivateHome.Room();

        PrivateHome.Room room2 = new PrivateHome.Room();
    }
}
