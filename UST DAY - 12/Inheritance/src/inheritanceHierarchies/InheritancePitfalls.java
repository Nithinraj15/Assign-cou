package inheritanceHierarchies;

abstract class Shape {
 public abstract int getArea();
}

class Rectangle extends Shape {
 private int width;
 private int height;

 public Rectangle(int width, int height) {
     this.width = width;
     this.height = height;
 }

 public int getWidth() {
     return width;
 }

 public int getHeight() {
     return height;
 }

 public void setWidth(int width) {
     this.width = width;
 }

 public void setHeight(int height) {
     this.height = height;
 }

 @Override
 public int getArea() {
     return width * height;
 }

 @Override
 public String toString() {
     return "Rectangle [width=" + width + ", height=" + height + ", area=" + getArea() + "]";
 }
}


class Square extends Shape {
 private int side;

 public Square(int side) {
     this.side = side;
 }

 public int getSide() {
     return side;
 }

 public void setSide(int side) {
     this.side = side;
 }

 @Override
 public int getArea() {
     return side * side;
 }

 @Override
 public String toString() {
     return "Square [side=" + side + ", area=" + getArea() + "]";
 }
}

public class InheritancePitfalls {
 public static void main(String[] args) {
     Shape rect = new Rectangle(4, 6);
     Shape square = new Square(5);

     System.out.println(rect);
     System.out.println(square);

    
     rect = new Rectangle(10, 20);
     System.out.println("Updated Rectangle: " + rect);

     square = new Square(8);
     System.out.println("Updated Square: " + square);
 }
}

