package com.iglaz.astonbase.lesson2.B;

public class PlaneCircle extends Circle {
    public static final double PI = 3.14159265358979323846;
    private final double cx, cy;
    public double r;

    public PlaneCircle(double r, double x, double y) {
        super(r);
        this.cx = x; // Initialize the instance field cx
        this.cy = y; // Initialize the instance field cy
        this.r = Math.sqrt(cx * cx + cy * cy);
    }

    public double getCenterX() {
        return cx;
    }

    public double getCenterY() {
        return cx;
    }

    public void sayAboutMe() {
        System.out.println("PlaneCircle");
    }

    @Override
    public double getRadius() {
        return super.getRadius();
    }
}

//    public PlaneCircle() {
//    super();
//      }

