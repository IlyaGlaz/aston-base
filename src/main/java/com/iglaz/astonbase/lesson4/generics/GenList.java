package com.iglaz.astonbase.lesson4.generics;

import java.util.List;

public class GenList<T extends Comparable<T>>{
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

    static <E> void doSomthing(E someType) {
        return;
    }

    public void putOtherList(List<T> other) {

    }

    public int getSize() {
        return size;
    }
}
