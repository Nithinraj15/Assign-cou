package InstanceOf;
import java.util.ArrayList;

// Abstract class Shape 
abstract class Shape {
    // Abstract method to calculate the area of the shape
    public abstract double getArea();
}

// Circle class extends Shape and implements the getArea method
class Circle extends Shape {
    private double radius; 

    // Constructor to initialize the radius
    Circle(double radius) {
        this.radius = radius;
    }

    // Getter method to access the radius
    public double getRadius() {
        return radius;
    }

    // Implementation of getArea for Circle (Area = π * radius^2)
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class extends Shape and implements the getArea method
class Rectangle extends Shape {
    private double width;  
    private double height; 

    // Constructor to initialize the width and height
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Getter method to access the width
    public double getWidth() {
        return width;
    }

    // Getter method to access the height
    public double getHeight() {
        return height;
    }

    // Implementation of getArea for Rectangle (Area = width * height)
    public double getArea() {
        return width * height;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<Shape> list = new ArrayList<>();
       
        // Create instances of Circle and Rectangle and add them to the list
        Shape cir = new Circle(5.0);  
        Shape rect = new Rectangle(4.0, 6.0);  
        list.add(cir);  
        list.add(rect); 
        list.add(new Circle(3.5));  

        // Iterate through the list of shapes and print their details
        for (Shape s : list) {

            if (s instanceof Circle) {
                Circle c = (Circle) s;  // Cast the Shape to a Circle
                
                System.out.println("Circle with radius: " + c.getRadius() + ", Area: " + c.getArea());
            } 
           
            else if (s instanceof Rectangle) {
                Rectangle r = (Rectangle) s;  // Cast the Shape to a Rectangle
            
                System.out.println("Rectangle with width: " + r.getWidth() + ", height: " + r.getHeight() + ", Area: " + r.getArea());
            }
        }
    }
}
