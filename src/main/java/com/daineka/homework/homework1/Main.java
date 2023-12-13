package com.daineka.homework.homework1;

import java.util.Comparator;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        ArrayList<Auto> arrayList = new ArrayList<>();
        for (int i = 10; i >= 0; i--) {
            arrayList.add(new Auto(i, i));
        }
        System.out.println(arrayList);
        arrayList.remove(0);
        arrayList.remove(new Auto(0, 0));
        System.out.println(arrayList);
        ArrayList.bubbleSort(arrayList, new Comparator<Auto>() {
            @Override
            public int compare(Auto o1, Auto o2) {
                return o1.getSpeed() - o2.getSpeed();
            }
        });
        System.out.println(arrayList);
    }
}

class Auto extends Vehicle{
    private int weight;

    public Auto(int speed, int weight) {
        super(speed);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "" + weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Auto auto = (Auto) o;
        return weight == auto.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight);
    }


}

class Vehicle implements Comparable<Vehicle>{
    private int speed;

    @Override
    public String toString() {
        return "" + speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return speed == vehicle.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }

    public int getSpeed() {
        return speed;
    }

    public Vehicle(int speed) {
        this.speed = speed;
    }

    @Override
    public int compareTo(Vehicle o) {
        return 0;
    }
}
