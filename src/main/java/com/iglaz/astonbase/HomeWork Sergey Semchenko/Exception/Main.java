package Exception;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.random.RandomGenerator;

public class Main {
    public static void main(String[] args) {
        //  1. Объявите ссылочную переменную со значением null. Вызовите метод у этой переменной.
        //  Отловить возникшее исключение c помощью блока try-catch.

        HashMap<Integer, Integer> map = null;
        try {
            map.get(1);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        // 2. Написать код, который создаст, а затем отловит ArrayIndexOutOfBoundsException.

        int[] array = {1, 2, 3};
        try {
            int i = array[3];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        // 3. Создать собственный класс-исключение - наследник класса Exception.
        // Создать метод, выбрасывающий это исключение. Вызвать этот метод и отловить исключение.
        // Вывести stack trace в консоль.

        try {
            CustomException.getException();
        } catch (CustomException e) {
            e.printStackTrace();
        }

        // 4. Бросить одно из существующих в JDK исключений, отловить его и оберните его в свое кастомное исключение
        // указав в качестве причины отловленное.

        try {
            map.get(1);
        } catch (Exception e) {
            try {
                throw new CustomException(e);
            } catch (CustomException ex) {
                System.out.println("Причина исключени: " + ex.exception.getClass());
            }
        }

        //5. Создать метод случайным образом выбрасывающий одно из 3-х видов исключений.
        // Вызвать этот метод в блоке try-catch, отлавливающим любое из 3-х.

        try {
            randomException();
        } catch (IndexOutOfBoundsException | IllegalArgumentException | NullPointerException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void randomException() {
        int i = new Random().nextInt(2);
        switch (i) {
            case 0: throw new IndexOutOfBoundsException();
            case 1: throw new IllegalArgumentException();
            case 2: throw new NullPointerException();
        }
    }



}
