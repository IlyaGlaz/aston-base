/*
Дз коллекции:
        Необходимо написать свою реализацию коллекции на выбор LinkedList или ArrayList(можно оба варианта).
        Должны быть основные методы add, get, remove, addAll, остальное на ваше усмотрение.
        Плюс написать реализацию сортировки пузырьком с флагом, который прекращает сортировку,
        если коллекция уже отсортирована.
        Задание с *: На тему дженериков. Для этих коллекций сделать конструктор который будет принимать другую
        коллекцию в качестве параметров и инициализироваться с элементами из этой коллекции. Вторая часть -
        сделать метод сортировки статическим, этот метод также будет принимать какую-то коллекцию и сортировать ее.
        (Аналогия Collections.sort()). Т.е подумать на тему какое ключевое слово(extends или super)
        будет лучше применить для этих двух задач.
*/
package com.daineka.homework.homework1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class ArrayList<T extends Comparable<T>> {
    private static final int DEFAULT_CAPACITY = 10;
    private T[] array;
    private int capacity;
    private int size;

    public ArrayList() {
        capacity = DEFAULT_CAPACITY;
        size = 0;
        this.array = (T[]) new Comparable[DEFAULT_CAPACITY];
    }

    public ArrayList(int initialCapacity) {
        capacity = initialCapacity;
        size = 0;
        array = (T[]) new Comparable[initialCapacity];
    }

    public ArrayList(Collection<? extends T> collection) {
        this.capacity = collection.size() + 10;
        this.size = 0;
        this.array = (T[]) new Comparable[this.capacity];
        for (T i : collection) {
            this.add(i);
        }
    }

    public ArrayList(ArrayList<? extends T> arrayList) {
        this.capacity = arrayList.capacity;
        this.size = arrayList.size;
        this.array = arrayList.array;
    }

    public void add(T element) {
        if (isSizeFull()) {
            growArray();
        }
        this.array[size++] = element;
    }

    public void add(int index, T element) {
        if (isSizeFull()) {
            growArray();
        }
        size++;
        shiftArrayToRight(index);
        this.array[index] = element;
    }

    public boolean addAll(ArrayList<? extends T> arrayList) {
        if (arrayList == null) {
            return false;
        }
        if (arrayList.size == 0) {
            return true;
        }
        for (int i = 0, length = arrayList.size; i < length; i++) {
            this.add((T) arrayList.array[i]);
        }
        return true;
    }

    public boolean addAll(Collection<? extends T> collection) {
        if (collection == null) {
            return false;
        }
        if (collection.isEmpty()) {
            return true;
        }
        for (T i : collection) {
            this.add(i);
        }
        return true;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Object get(int index) {
        if (!isIndexNormal(index)){
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    public boolean remove(int index) {
        if (isIndexNormal(index)) {
            remove(array, index);
            return true;
        }
        return false;
    }

    public boolean remove(T element) {
        for (int i = 0; i < this.size; i++) {
            if (element.equals(this.array[i])) {
                remove(this.array, i);
                return true;
            }
        }
        return false;
    }

    private void remove(T[] array, int index) {
        shiftArrayToLeft(index);
        this.size--;
        this.array[this.size] = null;
    }

    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(array[i])) {
                return true;
            }
        }
        return false;
    }

    public boolean clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        return true;
    }

    private void shiftArrayToLeft(int index) {
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
    }

    private void shiftArrayToRight(int index) {
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
    }

    private boolean isSizeFull() {
        return this.size >= this.capacity;
    }

    private boolean isIndexNormal(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        return true;
    }

    private void growArray() {
        this.capacity = this.capacity + (this.capacity >> 1);
        this.array = Arrays.copyOf(this.array, this.capacity);
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size - 1; i++) {
            result.append("[").append(array[i]).append("], ");
        }
        result.append("[").append(array[size - 1]).append("]");
        return String.valueOf(result);
    }

    public void bubbleSort() {
        int lastIndex = size - 1;
        while (lastIndex > 0) {
            boolean isSorted = true;
            for (int i = 0; i < lastIndex; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    swapElements(this, i, i + 1);
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
            lastIndex--;
        }
    }

    public static <T extends Comparable<T>> void bubbleSort(ArrayList<T> arrayList) {
        int lastIndex = arrayList.size - 1;
        while (lastIndex > 0) {
            boolean isSorted = true;
            for (int i = 0; i < lastIndex; i++) {
                if (arrayList.array[i].compareTo(arrayList.array[i + 1]) > 0) {
                    swapElements(arrayList, i, i + 1);
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
            lastIndex--;
        }
    }


    public static <T extends Comparable<T>> void bubbleSort(ArrayList<T> arrayList, Comparator<T> comparator) {
        int lastIndex = arrayList.size - 1;
        while (lastIndex > 0) {
            boolean isSorted = true;
            for (int i = 0; i < lastIndex; i++) {
                if (comparator.compare(arrayList.array[i], arrayList.array[i + 1]) > 0) {
                    swapElements(arrayList, i, i + 1);
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
            lastIndex--;
        }
    }

    private static <T extends Comparable<T>> void swapElements(ArrayList<T> arrayList, int firstIndexElement, int secondIndexElement) {
        T temp = arrayList.array[firstIndexElement];
        arrayList.array[firstIndexElement] = arrayList.array[secondIndexElement];
        arrayList.array[secondIndexElement] = temp;
    }

}