package Polymorphism;
class Shape{
	public void draw() {
		System.out.println("Drawing a generic shape.");
	}
	public double getArea() {
		return 0.0;
	}
}
class Circle extends Shape{
	private double radius;
	public Circle(double radius){
		this.radius = radius;
	}
	public double getradius() {
		return radius;
	}
	public void draw() {
		System.out.println("Drawing a Circle with radius " + radius + " .");
	}
	public double getArea() {
		return Math.PI * radius * radius;
	}
}
class Rectangle extends Shape{
	private double length;
	private double width;
	Rectangle(double length,double width){
		this.length = length;
		this.width = width;
	}
	public void draw() {
		System.out.println("Drawing a Rectangle with length " +  length + " and " + width + ".");
	}
	public double getArea() {
		return length * width;
	}
}
public class pgm2 {
	public static void main(String args[]) {
		
	}
}
