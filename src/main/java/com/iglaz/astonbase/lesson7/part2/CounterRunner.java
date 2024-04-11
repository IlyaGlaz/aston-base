package com.iglaz.astonbase.lesson7.part2;


/**
 * 1.Получить значение
 * 2.Изменить значенгие
 * 3.Полужить это значение в память
 *
 * -------> 9  ------> 9 + 1 --------> 10
 *
 * -------> 9 --------> 9 + 1 -------> 10
 *
 * -------->
 *
 * --------->
 */
public class CounterRunner {
    public static void main(String[] args) throws InterruptedException {
        UserCounter counter = new UserCounter();

        UserLogIn userLogIn1 = new UserLogIn(counter);
        UserLogIn userLogIn2 = new UserLogIn(counter);
        UserLogIn userLogIn3 = new UserLogIn(counter);
        UserLogIn userLogIn4 = new UserLogIn(counter);

        userLogIn1.start();
        userLogIn2.start();
        userLogIn3.start();
        userLogIn4.start();

        userLogIn1.join();
        userLogIn2.join();
        userLogIn3.join();
        userLogIn4.join();

        System.out.println(counter.getUserCounter());
    }
}
