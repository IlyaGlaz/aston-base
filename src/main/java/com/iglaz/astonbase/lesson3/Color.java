package com.iglaz.astonbase.lesson3;

import com.iglaz.astonbase.lesson2.inheritance.Swimingable;

public enum Color implements Swimingable {
    GREEN(22, 44, 55) {
        @Override
        public void swim() {

        }
    },
    RED(1, 250, 0) {
        @Override
        public void swim() {

        }
    },
    BLACK(255, 255, 255) {
        @Override
        public void swim() {

        }
    };

    int r;
    int g;
    int b;

    Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }
}
