package lesson04;

import java.util.Arrays;

public class LASArrayList<E> {
    private E[] elements;
    private final int DEFAULT_CAPACITY = 5;
    private int size;

    public LASArrayList () {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
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

    public Object get(int index){
        return elements[index];
    }

    public void remove(int index) {
        System.arraycopy(elements, index+1, elements, index, size-index-1);
        elements[size-1] = null;
        size--;
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
}