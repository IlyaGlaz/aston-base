package com.iglaz.astonbase.lesson4.generics;

import java.util.Collection;
import java.util.List;

public class GenList<T extends Comparable<T>> {
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

    static <E> E doSomthing(E someType) {
        return someType;
    }

    public void putOtherList(List<T> other) {

    }

    static void sort(Collection<? extends Comparable<?>> collection) {

    }

    public int getSize() {
        return size;
    }
}
