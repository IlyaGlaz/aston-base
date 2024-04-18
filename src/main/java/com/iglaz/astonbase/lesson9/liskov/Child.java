package com.iglaz.astonbase.lesson9.liskov;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class Child extends Parent {

//    @Override
//    void feed(Cat animal) {
//        // some logic
//
//        return new Cat;
//    }

//    /**
//     * Good
//     */
//    @Override
//    void feed(Animal animal) {
//        // some logic
//
//    }
//
//    /**
//     * Bad
//     */
//    @Override
//    void feed(BengalCat cat) {
//        // some logic
//
//    }

//    /**
//     * Good
//     */
//    @Override
//    BengalCat feed() {
//        // some logic
//
//        return new BengalCat();
//    }

//    /**
//     * Bad
//     */
//    @Override
//    Animal feed() {
//        // some logic
//
//        return new Animal();
//    }


//    @Override
//    int calculate(int number) {
//        if (number < 0) {
//            return 0;
//        }
//
//        // some logic
//
//        return number * number;
//    }

//    @Override
//    int calculate(int number) {
//        if (number < 0) {
//            return 0;
//        }
//
//        // some logic
//
//        return number * number;
//    }


    @Override
    void findInDB(Long id) throws SQLException {
        Connection connection = DriverManager.getConnection("", "", "");

    }
}
