package com.iglaz.astonbase.lesson9.liskov;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Parent {

    void feed(Cat animal) {
        // some logic
    }

    Cat feed() {
        return new Cat();
    }

    int calculate(int number) {
        // some logic
        return number * number;
    }

    void findInDB(Long id) throws SQLException {
       Connection connection = DriverManager.getConnection("", "", "");

       //some logic

        connection.close();
    }
}
