package com.iglaz.astonbase.lesson5.sort;


import com.iglaz.astonbase.lesson5.Employee;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

public class Sorting {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee("Zvan", 22),
                new Employee("Retor", 24),
                new Employee("Aax", 6));
//
//        Employee ivan = new Employee("Inva", 22);
//        Employee ivan2 = new Employee("Inva", 22);

        Collections.sort(list, new Comparator<Employee>() {

            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }

        });

        System.out.println(list);

        TreeMap<String, String> employeeStringTreeMap = new TreeMap<>();
    }
}
