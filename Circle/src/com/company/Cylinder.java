package com.company;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
        //this.type=type;
    }

    public double getHeight() {

        return height;
    }

    public double getVolume() {

        return getHeight() * getArea();
    }


}
