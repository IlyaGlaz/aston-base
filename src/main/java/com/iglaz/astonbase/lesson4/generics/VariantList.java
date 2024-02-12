package com.iglaz.astonbase.lesson4.generics;

public class VariantList<T> {
    private final T[] elements;
    private int size;

    public VariantList(int startValue) {
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
}
