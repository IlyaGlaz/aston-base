package com.iglaz.astonbase.lesson2.composition;

public class Manager implements Employee {
    private Employee report;

    public Manager(Employee staff) {
        report = staff;
    }

    public void work() {
        report.work();
    }
}

