package com.iglaz.astonbase.lesson1.initialization;

public class InitialValues {
    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    int[] numbers;
    InitialValues reference;

    public static void main(String[] args) {
        InitialValues iv = new InitialValues();

        System.out.println("Data type      Initial value");
        System.out.println("boolean        " + iv.t);
        System.out.println("char           [" + iv.c + "]");
        System.out.println("byte           " + iv.b);
        System.out.println("short          " + iv.s);
        System.out.println("int            " + iv.i);
        System.out.println("long           " + iv.l);
        System.out.println("float          " + iv.f);
        System.out.println("double         " + iv.d);
        System.out.println("numbers        " + iv.numbers);
        System.out.println("reference      " + iv.reference);
    }
}
