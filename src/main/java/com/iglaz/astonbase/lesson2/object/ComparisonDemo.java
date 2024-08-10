package com.iglaz.astonbase.lesson2.object;

public class ComparisonDemo {
    public static void main(String[] args) {
        Object client = new Client("d", 22);
        Client client1 = new Client("d", 22);

        System.out.println(client1.getClass());
        System.out.println(client.getClass());

//        System.out.println(Object == Client.class);


//        Client ivan = new Client("Ivan", 22);
//
//        System.out.println(ivan.toString());

//        int num1 = 124;
//        int num2 = 124;
//        int num3 = 500;
//
//        System.out.println(num1 == num2);
//        System.out.println(num1 == num3);

        Client maxim = new Client("Ivan", 30);
        Client ivan = new Client("Ivan", 30);

        System.out.println(maxim.equals(ivan));
//
//        System.out.println(ivan.hashCode());


//        System.out.println(maxim == maximus);
//        System.out.println(maxim.equals(ivan));
//        System.out.println(maxim.hashCode() + " " + ivan.hashCode());
//        System.out.println(maxim == ivan);
    }
}
