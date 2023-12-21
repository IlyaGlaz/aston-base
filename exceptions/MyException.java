package exceptions;

public class MyException extends Exception{
    public MyException() {}

    public MyException(ArithmeticException e) {
        System.out.println("Обработка арифметического исключения");
    }
}
