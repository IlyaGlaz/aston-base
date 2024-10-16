package com.iglaz.astonbase.lesson1.figure;

public class CircleRunner {
    public static void main(String[] args) {
        double circleRadius = 5.15;

        Circle c = new Circle(5.15);

        Circle circle = new Circle(5.15);
        Circle circle2 = new Circle(2.44);
        Circle circle3 = new Circle(44.4);
        Circle circle4 = new Circle(5.15);

        System.out.println(circle.circumference());
        System.out.println(circle2.circumference());
        System.out.println(circle3.circumference());
        System.out.println(circle4.circumference());
    }
}
