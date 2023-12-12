package lesson04;

public class Demo {
    public static void main(String[] args) {
        LASArrayList<Cat> list = new LASArrayList<>();
        System.out.println(list);

        list.add(new Cat("Барсик"));
        list.add(new Cat("Матроскин"));
        list.add(new Cat("Бегемот"));
        list.add(new Cat("Ричи"));
        list.add(new Cat("Арчи"));
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        System.out.println(list.get(2));

        LASArrayList<Cat> list2 = new LASArrayList<>();
        list2.add(new Cat("Симба"));
        list2.add(new Cat("Нала"));
        System.out.println(list2);

        list.addAll(list2);
        System.out.println(list);
    }
}

class Cat {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
