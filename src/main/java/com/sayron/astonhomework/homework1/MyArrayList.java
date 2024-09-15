package com.sayron.astonhomework.homework1;

import java.util.Arrays;
import java.util.Collection;

public class MyArrayList<T> {
    private final int DEFAULT_CAPACITY = 10;
    private T[] list;
    private int size;

    public MyArrayList() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public MyArrayList(Collection<? extends T> collection) {
        if (!collection.isEmpty()) {
            this.list = (T[]) collection.toArray();
            this.size = list.length;
        }
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

    public void bubbleSort() {
        boolean swapped;
        for (int i = 0; i < size - 1; i++) {
            swapped = false;
            for (int j = 0; j < size - i - 1; j++) {
                if (((Comparable<T>) list[j]).compareTo(list[j + 1]) > 0) {
                    T temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static <T extends Comparable<? super T>> void sort(MyArrayList<T> collection) {
        boolean swapped;
        T[] list = collection.getList();
        int size = collection.size();

        for (int i = 0; i < size - 1; i++) {
            swapped = false;
            for (int j = 0; j < size - i - 1; j++) {
                if (list[j].compareTo(list[j + 1]) > 0) {
                    T temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
