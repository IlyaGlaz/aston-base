package com.iglaz.astonbase.lesson9.prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        Rectangle anyForm = new Rectangle(22, "anyForm", 22, 44);

        Shape copyShape = anyForm.copy();

        System.out.println(anyForm);
        System.out.println(copyShape);

    }
}
