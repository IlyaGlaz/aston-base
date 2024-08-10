package com.iglaz.astonbase.lesson1.structure;

public class Person {
    private int age;
    private String name;

    static {
        System.out.println("In static block");
    }

    {
        System.out.println("Non static block");
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("In constructor");
    }

    public Person() {
        System.out.println("In constructor");
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this(0);
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hey, my name is... " + name);
    }

    public void sayHello(int age) {
        System.out.println("Hey, my name is... " + name);
    }

    public void someMethod() {
        System.out.println("Up");
        someLogic();
    }

    private void someLogic() {
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age > 100) {
            System.out.println("Not correct");
        } else {
            this.age = age;
        }
    }

    public void setName(String name) {
        this.name = name;
    }
}
