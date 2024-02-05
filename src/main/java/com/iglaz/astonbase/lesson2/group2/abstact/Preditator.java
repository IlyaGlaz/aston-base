package com.iglaz.astonbase.lesson2.group2.abstact;

interface Preditator {

    final static String NAME_NAME = "";

    void hunt();

    default void go() {
        forRun();
        System.out.println("gogo");
    }

    static void perforFastRun() {
        System.out.println("Run run");
    }

    private void forRun() {
        System.out.println("Some run");
    }
}
