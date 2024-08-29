package com.iglaz.astonbase.lesson7.part2;


/**
 * 1.Получить значение
 * 2.Изменить значенгие
 * 3.Полужить это значение в память
 *
 * -------> 9  ------> 9 + 1 --------> 10
 *
 * -------> 10 --------> 10 + 1 -------> 11
 *
 * -------->
 *
 * --------->
 */
public class CounterRunner {
    public static void main(String[] args) throws InterruptedException {
        SharedCounter counter = new SharedCounter();

        IncrementThread incrementThread1 = new IncrementThread(counter);
        IncrementThread incrementThread2 = new IncrementThread(counter);
        IncrementThread incrementThread3 = new IncrementThread(counter);
        IncrementThread userLogIn4 = new IncrementThread(counter);

//        synchronized (counter) {
//
//        }

        incrementThread1.start();
        incrementThread2.start();
        incrementThread3.start();
        userLogIn4.start();

        incrementThread1.join();
        incrementThread2.join();
        incrementThread3.join();
        userLogIn4.join();

        System.out.println(counter.getUserCounter());
    }
}
