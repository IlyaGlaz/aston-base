package com.iglaz.astonbase.lesson3.E;

public class HomeDemo {
    public static void main(String[] args) {
        Home.Room room2 = new Home().new Room();

        System.out.println();

        PrivateHome.Room room1 = new PrivateHome.Room();
        PrivateHome.Room room4 = new PrivateHome.Room();
        PrivateHome.Room room3 = new PrivateHome.Room();
    }
}
