package com.sayron.astonhomework.homework1;

import java.util.Arrays;

public class MyArrayList<T> {
    private final int DEFAULT_CAPACITY = 10;
    private T[] list;
    private int size;

    public MyArrayList() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public MyArrayList(T[] list) {
        this.list = Arrays.copyOf(list, list.length);
        size = list.length;
    }

    public MyArrayList(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity cannot be negative");
        } else {
            list = (T[]) new Object[capacity];
            size = 0;
        }
    }

    public void add(T element) {
        ensureCapacity(size + 1);
        list[size++] = element;
    }

    public void addAll(MyArrayList<T> elements) {
        ensureCapacity(size + elements.size);
        System.arraycopy(elements.list, 0, list, size, elements.size);
        size += elements.size;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return list[index];
    }

    public boolean remove(T element) {
        for (int i = 0; i < size; i++) {
            if (list[i].equals(element)) {
                removeAt(i);
                return true;
            }
        }
        return false;
    }

    private void removeAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        System.arraycopy(list, index + 1, list, index, size - index - 1);
        size--;
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > list.length) {
            int newCapacity = list.length * 2;
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            list = Arrays.copyOf(list, newCapacity);
        }
    }

    public T[] getList() {
        return Arrays.copyOf(list, size);
    }

    public int size() {
        return size;
    }
}
