package com.iglaz.astonbase.lesson4.generics;

public class GenList<T> {
    private final T[] elements;
    private int size;

    public GenList(int startValue) {
        this.elements = (T[]) new Object[startValue];
    }

    public void add(T element) {
        elements[size] = element;
        size++;
    }

    public T get(int number) {
        return elements[number];
    }

    public int getSize() {
        return size;
    }

    void sort() {

    }

    public static <E extends Number, R> R doSomething(E type) {
        return (R) Double.valueOf("22.2");
    }
}
