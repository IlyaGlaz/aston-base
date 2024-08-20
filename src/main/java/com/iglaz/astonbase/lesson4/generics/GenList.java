package com.iglaz.astonbase.lesson4.generics;

public class GenList<T extends String> {
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

    static <E> E addOtherElement(E elem) {
        return elem;
    }

    void sort() {

    }

    public int getSize() {
        return size;
    }
}
