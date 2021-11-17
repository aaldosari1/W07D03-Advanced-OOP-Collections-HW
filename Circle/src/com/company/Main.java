package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Cylinder cylinder = new Cylinder(3, "green", 5);
        System.out.println("The radius of the Circle: " + cylinder.getRadius());
        System.out.println("The area of the Circle: " + cylinder.getArea());
        System.out.println("The height of the Cylinder: " + cylinder.getHeight());
        System.out.println("The volume of the Cylinder: " + cylinder.getVolume());

    }
}
