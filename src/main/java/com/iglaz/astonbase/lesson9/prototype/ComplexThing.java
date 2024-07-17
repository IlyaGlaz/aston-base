package com.iglaz.astonbase.lesson9.prototype;

public class ComplexThing {
    int x;
    int y;
    int z;

    public ComplexThing(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public ComplexThing(ComplexThing rectangle, int z) {
        this.x = rectangle.x;
        this.y = rectangle.y;
        this.z = z;
    }
    
    ComplexThing copy(int z) {
        return new ComplexThing(this, z);
    }

    @Override
    public String toString() {
        return "ComplexThing{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
