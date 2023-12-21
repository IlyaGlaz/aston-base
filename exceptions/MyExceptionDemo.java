package exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;

public class MyExceptionDemo {
    public static void main(String[] args) {

        // Исключения

        // 1. Объявите ссылочную переменную со значением null. Вызовите метод у этой переменной. Отловить возникшее исключение c помощью блока try-catch

        Object o = null;
        try {
            o.toString();
        } catch (NullPointerException e) {
            System.out.println("Исключение: значение ссылочной переменной - null");
        }

        // 2. Написать код, который создаст, а затем отловит ArrayIndexOutOfBoundsException.

        int[] integers = {1, 2, 3};
        try {
            integers[3] = 4;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Исключение: IndexOutOfBoundsException");
        }

        // 3. Создать собственный класс-исключение - наследник класса Exception. Создать метод, выбрасывающий это исключение. Вызвать этот метод и отловить исключение. Вывести stack trace в консоль.

        int a = 1;
        if (a != 0) {
            try {
                throwMyException(a);
            } catch (MyException e) {
                e.printStackTrace();
            }
        }

        // 4. Бросить одно из существующих в JDK исключений, отловить его и оберните его в свое кастомное исключение указав в качестве причины отловленное.
        int b = 0;
        try {
            int c = a / b;
        } catch (ArithmeticException e) {
            try {
                throw new MyException(e);
            } catch (MyException ex) {
                System.out.println("Арифметическое исключение обёрнуто в exceptions.MyException");
            }
        }

        // 5. Создать метод случайным образом выбрасывающий одно из 3-х видов исключений. Вызвать этот метод в блоке try-catch, отлавливающим любое из 3-х.
        try {
            returnRandomException();
        }catch (Exception e) {
            e.printStackTrace();
        }


    }

    // статический метод, выбрасывающий собственный класс-исключение для задания 3
    static void throwMyException(int i) throws MyException {
        if (i != 0) {
            throw new MyException();
        }
    }

    // метод, случайным образом выбрасывающий один из трёх видов исключений для задания 5
    static void returnRandomException() throws FileNotFoundException {
        Random r = new Random();
        int c = r.nextInt(3);
        switch (c) {
            case 0 -> {
                int d = 2/0;
            }
            case 1 -> {
                File file = new File("asdf");
                FileInputStream f = new FileInputStream(file);
            }
            case 2 -> {
                int[] e = {1, 2};
                e [2] = 3;
            }
        }
    }
}