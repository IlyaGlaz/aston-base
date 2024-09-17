package com.iglaz.astonbase.lesson3.en;

public enum Color implements Some {
    BLUE(22, 44, 44) {
        @Override
        void someOther() {

        }

        @Override
        public void some() {

        }
    },
    GREEN( 0, 4, 0) {
        @Override
        void someOther() {

        }

        @Override
        public void some() {

        }
    },
    RED(44, 44, 4) {
        @Override
        void someOther() {

        }

        @Override
        public void some() {

        }
    };

    int b;
    int g;
    int r;

    Color(int r, int b, int g) {
        this.r = r;
        this.b = b;
        this.g = g;
    }

    abstract void someOther();

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }
}