package com.iglaz.astonbase.lesson2.D;

public enum Color implements SomeInter {
    RED(255, 0, 0) {
        @Override
        public void someMeth() {

        }
    },
    GREEN(255, 0, 0) {
        @Override
        public void someMeth() {

        }
    },
    BLUE(10, 2, 2) {
        @Override
        public void someMeth() {

        }
    };

    final int r;
    final int g;
    final int b;

    Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int getR() {
        return r;
    }

    public int getG() {
        return g;
    }

    public int getB() {
        return b;
    }

}