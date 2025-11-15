package Polymorphism;

import java.util.*;
abstract class Shape1 {
    public abstract void draw();
    public abstract double getArea();
}
class Circle1 extends Shape {
    private double radius;

    Circle1(double radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing a Circle...");
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
class Rectangle1 extends Shape1 {
    private double length;
    private double width;

    Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public void draw() {
        System.out.println("Drawing a Rectangle...");
    }
    public double getArea() {
        return length * width;
    }
}
class AreaCalculator1 {
   
    public double calculateArea(double side) {
        return side * side;
    }
    public double calculateArea(double length, double width) {
        return length * width;
    }
    public double calculateArea(double radius, boolean isCircle) {
        if (isCircle) {
            return Math.PI * radius * radius;
        } else {
            return 0.0;
        }
    }
}
public class Pgm3 {
    public static void main(String[] args) {
    	
        AreaCalculator1 ac = new AreaCalculator1();
        System.out.println("=== Method Overloading Demo ===");
        System.out.println("Area of Square: " + ac.calculateArea(4.5));
        System.out.println("Area of Rectangle: " + ac.calculateArea(12.2, 13.1));
        System.out.println("Area of Circle: " + ac.calculateArea(2.4, true));
        System.out.println();

        System.out.println("=== Method Overriding Demo ===");
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(3.0));
        shapes.add(new Rectangle(4.0, 5.0));

        for (Shape s : shapes) {
            s.draw();
            System.out.println("Area: " + s.getArea());
        }
    }
}
