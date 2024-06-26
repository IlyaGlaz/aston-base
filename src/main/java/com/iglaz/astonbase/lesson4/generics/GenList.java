package com.iglaz.astonbase.lesson4.generics;

import com.iglaz.astonbase.lesson3.D.Color;

import java.util.Collection;
import java.util.List;

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

    static <E> void doSomthing(E someType) {
        return;
    }

    public void putOtherList(List<T> other) {

    }

    static void sort(Collection<? extends Comparable<?>> collection) {

    }

    public int getSize() {
        return size;
    }
}
