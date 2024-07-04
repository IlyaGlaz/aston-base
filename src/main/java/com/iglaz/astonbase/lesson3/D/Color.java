package com.iglaz.astonbase.lesson3.D;

import com.iglaz.astonbase.lesson3.A.Predator;

public enum Color implements Predator {
    GREEN(22, 23, 234) {
        @Override
        void doSomthing() {
            System.out.println("grean");
        }

        public void simple() {

        }
    },
    BLUE(23, 234, 234) {
        @Override
        void doSomthing() {

        }
    },
    RED(23, 234, 0) {
        @Override
        void doSomthing() {

        }
    };

    private final int r;
    private final int g;
    private final int b;

    Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int getR() {
        return r;
    }

    public int getB() {
        return b;
    }

    public int getG() {
        return g;
    }

    @Override
    public void hunt() {

    }

    void doSomthing() {
        System.out.println("Color perent");
    }
}