package myArrayList;

import java.util.Comparator;

public class Demo {
    public static void main(String[] args) {
        LASArrayList<Cat> list = new LASArrayList<>();
        System.out.println(list);

        list.add(new Cat("Барсик", 8));
        list.add(new Cat("Матроскин", 12));
        list.add(new Cat("Бегемот", 15));
        list.add(new Cat("Ричи", 2));
        list.add(new Cat("Арчи", 5));
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        System.out.println(list.get(2));

        LASArrayList<Cat> list2 = new LASArrayList<>();
        list2.add(new Cat("Симба", 3));
        list2.add(new Cat("Нала", 3));
        System.out.println(list2);

        list.addAll(list2);
        System.out.println(list);

        Comparator<Cat> compareCats = new CompareCatsByAge();
        LASArrayList.LASBubbleSort(list, compareCats);
        System.out.println(list);

        LASArrayList<Cat> list3 = new LASArrayList<>(list2);
        System.out.println(list3);
    }
}

class Cat{
    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " возраст " + age;
    }
}

class CompareCatsByAge implements Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.age - o2.age;
    }
}
