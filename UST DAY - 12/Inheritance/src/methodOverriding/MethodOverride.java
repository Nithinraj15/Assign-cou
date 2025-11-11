package methodOverriding;
abstract class Shape{
	abstract double calculateArea();
	public void displayMessage() {
		System.out.println("This is a generic shape.");
	}
}
class Circle extends Shape{
	private double radius;
	Circle(double radius){
		this.radius = radius;
	}
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
}
class Rectangle extends Shape{
	private double width;
	private double height;
	Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	public double calculateArea() {
		return width*height;
	}
}
public class MethodOverride {
	public static void main(String args[]) {
	Circle cir = new Circle(5.0);
	Rectangle rect = new Rectangle(4.0,3.0);
	cir.displayMessage();
	System.out.println("Area of Circle: " + cir.calculateArea());
	rect.displayMessage();
	System.out.println("Area of Rectangle: " + rect.calculateArea());
	}
}
