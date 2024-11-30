package main.java.com.iglaz.astonbase.lesson4.homework;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        MyArrayList<String> myStringList = new MyArrayList<>();
        myStringList.add("Mother");
        myStringList.add("Father");
        myStringList.add("Brother");
        System.out.println(myStringList.get(1));
        myStringList.remove(1);
        System.out.println(myStringList.get(1));
        MyArrayList<Integer> myIntList = new MyArrayList<>();
        myIntList.add(5);
        myIntList.add(2);
        myIntList.add(7);
        myIntList.add(3);
        myIntList.bubbleSort();
        System.out.println(myIntList);

    }
}
