package com.iglaz.astonbase.lesson5.sort;

import com.iglaz.astonbase.lesson5.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
//        System.out.println("Ivan".hashCode());
//        System.out.println("Max".hashCode());

//        Employee ivan = new Employee("Inva", 22);
//        Employee max = new Employee("Max", 44);
//
//        ivan.compareTo(max);

        List<Employee> list = Arrays.asList(
                new Employee("Zvan", 22),
                new Employee("Retor", 24),
                new Employee("Aax", 6)
        );

        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.getName().compareTo(o1.getName());
            }
        });

        System.out.println(list);
    }

    static class MyComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }
}
