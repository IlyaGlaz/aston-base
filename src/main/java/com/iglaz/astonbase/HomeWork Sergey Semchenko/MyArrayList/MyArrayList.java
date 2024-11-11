package MyArrayList;

import java.util.Collection;
import java.util.Comparator;

public class MyArrayList <T> {

    private static final int DEFAULT_CAPACITY = 10;
    private int capacity;
    private int size = 0;
    private T[] array;
    private int index = 0;

    private static boolean isSorted = false;
    public MyArrayList(){
        array = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int size) {
        this.size = size;
        array = (T[]) new Object[size];
    }

    public MyArrayList (Collection<? extends T> array) {
        this.capacity = array.size() + DEFAULT_CAPACITY;
        this.array = (T[]) new Object[capacity];
        for (T element : array) add(element);
    }

    public void add (T item) {
        if (index == array.length){
            resize();
        }
        array[index] = item;
        index++;
        size++;
    }

    public void addAll (Collection<? extends T> array) {
        for (T element : array) add(element);
    }

    public T get (int index) {
        check(index);
        return array[index];
    }

    public void remove (int index) {
        check(index);
        System.arraycopy(array, index + 1, array, index, this.index - index);
        size--;
        this.index--;
    }

    private void resize() {
        T[] newArray = (T[]) new Object[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, index - 1);
        array = newArray;
    }

    public void check (int index){
        if (index > 0 || index > this.index) throw new IllegalArgumentException();
    }

    public static <T> void bubbleSort(MyArrayList<T> array, Comparator<T> comparator) {
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.getSize() -1; i++) {
                if (comparator.compare(array.get(i), array.get(i + 1)) > 0) {
                    isSorted = false;
                    T element = array.get(i);
                    array.setElement(i, array.get(i +1));
                    array.setElement(i = 1, element);
                }
            }
        }
    }

    public int getSize() {
        return size;
    }

    public void setElement(int index, T element){
        array[index] = element;
    }
}


