package com.iglaz.astonbase.homework;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
    Лещенко Василий
 */

public class MyArrayList<T> {
    private Object[] mass;
    private final int DEFAULT_CAPACITY = 32;
    private int capacity;
    private int size;

    public MyArrayList() {
        capacity = DEFAULT_CAPACITY;
        size = 0;
        mass = new Object[capacity];
    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        size = 0;
        mass = new Object[capacity];
    }

    public MyArrayList(T... mass) {
        this.capacity = mass.length * 2;
        this.size = mass.length;
        this.mass = mass;
    }

    public void add(T element) {
        if (size + 1 > capacity) {
            grow();
        }

        mass[size++] = element;
    }

    public T get(int index) {
        return (T) mass[index];
    }
    public void set(int index, T element) {
        mass[index] = element;
    }

    public void remove(int index) {
        mass[index] = null;

        if (index != size - 1) {
            Object[] temp = Arrays.copyOfRange(mass, index + 1, mass.length);
            System.arraycopy(temp, 0, mass, index, temp.length);
        }

        size--;
    }

    public void addAll(T... elements) {
        if (size + elements.length > capacity) {
            grow(elements.length);
        }

        System.arraycopy(elements, 0, mass, size, elements.length);

        size += elements.length;
    }

    private void grow() {
        Object[] newMass = new Object[capacity * 2];
        System.arraycopy(mass, 0, newMass, 0, mass.length);
        mass = newMass;
    }

    private void grow(int additional) {
        Object[] newMass = new Object[(additional + capacity) * 2];
        System.arraycopy(mass, 0, newMass, 0, mass.length);
        mass = newMass;
    }

    public int getSize() {
        return size;
    }

    public void bubbleSort(Comparator<T> comparator) {
        boolean flag = true;
        int permutations = 0;
        int last = size - 1;

        while (flag) {
            for (int i = 0; i < last; i++) {
                if (comparator.compare((T) mass[i], (T) mass[i + 1]) > 0) {
                    Object temp = mass[i + 1];
                    mass[i + 1] = mass[i];
                    mass[i] = temp;
                    permutations++;
                }
            }

            if (permutations == 0) {
                flag = false;
            }

            last--;
            permutations = 0;
        }
    }

    public static <K> void sort(MyArrayList<K> list, Comparator<K> comparator) {
        boolean flag = true;
        int permutations = 0;
        int last = list.size - 1;

        while (flag) {
            for (int i = 0; i < last; i++) {
                if (comparator.compare(list.get(i), list.get(i + 1)) > 0) {
                    K temp = list.get(i + 1);
                    list.set(i + 1, list.get(i));
                    list.set(i, temp);
                    permutations++;
                }
            }

            if (permutations == 0) {
                flag = false;
            }

            last--;
            permutations = 0;
        }
    }

}
