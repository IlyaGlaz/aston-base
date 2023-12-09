package com.iglaz.astonbase.lesson4.generics;

public class AnyList {
    private final Object[] elements;
    private int size;

    public AnyList(int startValue) {
        this.elements = new Object[startValue];
    }

    public void add(Object element) {
        elements[size] = element;
        size++;
    }

    public Object get(int number) {
        return elements[number];
    }

    public int getSize() {
        return size;
    }
}
