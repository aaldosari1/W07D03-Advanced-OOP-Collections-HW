package com.company;
public class Circle {
    double radius=1.0;
    String color="red";
   public Circle(double radius, String color){
       this.radius=radius;
       this.color=color;
   }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return (radius * radius)* Math.PI;
    }

}



