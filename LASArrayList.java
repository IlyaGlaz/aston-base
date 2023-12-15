package myArrayList;

import java.util.Arrays;
import java.util.Comparator;

public class LASArrayList<E> {
    private E[] elements;
    private static final int DEFAULT_CAPACITY = 5;
    private int size;

    public LASArrayList () {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public LASArrayList (int capacity) {
        if (capacity >= 0)
            elements = (E[]) new Object[capacity];
        else throw new IllegalArgumentException("capacity < 0");
    }

    public LASArrayList (LASArrayList<E> list) {
        this.elements = (E[]) new Object[list.size];
        this.size = list.size;
        System.arraycopy(list.elements, 0, this.elements, 0, list.size);
    }

    public int size() {
        return size;
    }

    public void add(E element){
        add(size, element);
    }

    public void add(int index, E element){
        if(size == elements.length)
            grow();
        if (index == size)
            elements[size++] = element;
        else {
            System.arraycopy(elements, index, elements, index+1, size-index);
            elements[index] = element;
            size++;
        }
    }

    private void grow() {
        int capacity = (int) (elements.length * 1.5) + 1;
        E[] newElements = (E[]) new Object[capacity];
        System.arraycopy(elements, 0, newElements, 0, elements.length);
        elements = newElements;
    }

    public E get(int index){
        return (E) elements[index];
    }

    public void set(int index, E element) {
        elements[index] = element;
    }

    public void remove(int index) {
        System.arraycopy(elements, index+1, elements, index, size-index-1);
        elements[--size] = null;
//        size--;
    }

    public void addAll(LASArrayList<E> list) {
        for (int i = 0; i < list.size; i++) {
            add(list.elements[i]);
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elements, size));
    }

    public static <E> void LASBubbleSort(LASArrayList<E> list, Comparator<E> comparator) {
        E temp;
        boolean changed = true;
        int right = list.size - 1;

        while (changed) {
            changed = false;
            for (int i = 0; i < right; i++) {
                if (comparator.compare(list.get(i), list.get(i + 1)) > 0) {
                    temp = list.get(i + 1);
                    list.set(i + 1, list.get(i));
                    list.set(i, temp);
                    changed = true;
                }
            }
            right--;
        }
    }
}