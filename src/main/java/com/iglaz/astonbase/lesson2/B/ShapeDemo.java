package com.iglaz.astonbase.lesson2.B;

import java.util.LinkedList;
import java.util.List;

public class ShapeDemo {
    public static void main(String[] args) {
        Circle circle1 = new PlaneCircle(22, 1, 2);
        PlaneCircle circle4 = (PlaneCircle) circle1;
        circle4.sayAboutMe();

        circle4.area(22);
        List<String> list = new LinkedList<>();

        list.add("Hello");

        shapeArray();
    }

    static void shapeArray() {
        Shape[] shapes = new Shape[3];

//        shapes[0] = new Circle(2.0);
        shapes[1] = new Rectangle(1.0, 3.0);
        shapes[2] = new Rectangle(4.0, 2.0);
        double totalArea = 0;

        System.out.println(totalArea);
    }
}
