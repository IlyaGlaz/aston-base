import java.util.List;

// Класс-обёртка над массивом элементов одного типа
public class MyArrList<T extends Comparable<? super T>> { //implements List<T>
    private T[] elements;
    private int size=0;
    private int capacity = -1;

    // количество элементов, на которое увеличивается массив
    public int getCapacity(){
        return (capacity<0)?elements.length/2:capacity;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    //- конструктор
    public MyArrList(int length){
       this.elements = (T[]) new Comparable[length];
    }
    //- перегружаем конструктор
    public MyArrList(List<T> list) {
        size = list.size();
        elements = (T[]) new Comparable[size];
        for(int i=0; i<size; i++)
            elements[i] = list.get(i);
    }
    // размер списка - соответствует размеру МАССИВА, ЗАДЕЙСТВОВАННОГО ПОЛЬЗОВАТЕЛЕМ
    public int size() {
        return size;
    }

    // проверка на отсутствие элементов В КОЛЛЕКЦИИ
    public boolean isEmpty() {
        return size==0;
    }

    // 1. Получить элемент по индексу
    public T get(int index) {
        return elements[index];
    }
    // 2.1 Получение индекса элемента по значению, если такого нет - возвращает -1
    public int indexOf(T element) {
        for(int i=0; i<size; i++)
            if (elements[i].equals(element)) return i;
        return -1;
    }
    // 2.2 Проверка на наличие конкретного элемента
    public boolean contains(T element) {
        for(T elem: elements)
            if ( elem.equals(element) )
                return true;
        return false;
    }

    // 3.1 Установка значения элемента на позиции index в коллекции
    public T set(int index, T element) {
        // если индекс в пределах размера коллекции
        if (index<size)
            return elements[index] = element;
        return null;
    }

    // 3.2 Вставка элемента на позицию index в коллекции
    // Arrays.copyOf - лучше использовать его
    public void add(int index, T element) {
        try{
            // если уже нет запаса по длине массива elements
            if ((++size) > elements.length) {
                // переписываем в новый массив все эл-ты до позиции index
                T[] temp = rewriteElements(size+getCapacity(), index - 1);
                //temp[index] = element;
                // и дописываем оставшиеся элементы
                for (int i = index + 1; i < size; i++)
                    temp[i] = elements[i - 1];
                elements = temp;
            } else
                for (int i = size-1; i >index; i--)
                    elements[i] = elements[i-1];
            // не забываем вставить новый элемент
            elements[index] = element;
        }catch(NullPointerException e){
            System.out.println(e.toString());
        }
    }
    // 3.3 Вставка в конец коллекции
    public void add(T element) {
        add(size, element);
    }

    // 4. Удаление элемента из коллекции
    public T remove(int index) {
        // если индекс в пределах массива elements
        if (index<elements.length){
            T result = elements[index];
            if(elements.length-(--size)>getCapacity()){
                T[] temp = rewriteElements(size, index-1);
                for(int i=index; i<size; i++)
                    temp[i] = elements[i+1];
                elements = temp;
            }else
                for(int i=index; i<size; i++)
                    elements[i]=elements[i+1];
            return result;
        }else
            return null;
    }

    // 5. Сортировка элементов методом пузырька
    public void sort(){
        T element;
        for(int i=0; i<size()-1; i++)
            for(int j=0; j<(size()-1)-i; j++)
                if(elements[j].compareTo(elements[j+1])>0){
                    element =  elements[j];
                    elements[j] = elements[j+1];
                    elements[j+1] = element;
                }
    }

    // вспомогательный метод, переписывающий elements в новый массив длиной length до позиции index включительно
    private T[] rewriteElements(int length, int index){
        // создаём временный массив
        T[] temp = (T[]) new Comparable[length];
        // переписываем в него elements и присваиваем эту ссылку
        for(int i=0; i<=index ; i++)
            temp[i] = elements[i];
        return temp;
    }
    // для наглядного вывода
    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        for(int i=0; i<size; i++){
            str.append(elements[i].toString()+" \n");
        }
        return str.toString();
    }

    // ДЛЯ ОТЛАДКИ длина внутреннего массива
    public int getLen() {
        return elements.length;
    }
}
