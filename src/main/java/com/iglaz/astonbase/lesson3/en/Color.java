package com.iglaz.astonbase.lesson3.en;

import com.iglaz.astonbase.lesson2.inheritance.Flyable;

public enum Color implements Flyable {
    BLUE(22, 44, 44) {
        @Override
        public void fly() {

        }
    },

    RED(105, 0, 222) {
        @Override
        public void fly() {

        }
    },

    GREEN(11, 444, 22) {
        @Override
        public void fly() {

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

    public int getB() {
        return b;
    }

    public int getG() {
        return g;
    }

    public int getR() {
        return r;
    }
}