package Polymorphism1;
import java.util.ArrayList;
abstract class Shape{
	public abstract void draw();
	public String getAreaDescription() {
		return "Area is not specified for a generic shape.";
	}
}
class Circle extends Shape{
	public void draw() {
		System.out.println("Drawing a Circle.");
	}
	public int getRadius() {
		return 5;
	}
	 public String getAreaDescription() {
	        return "Area of circle is " + Math.PI * getRadius() * getRadius() + ".";
	 }
}
class Rectangle extends Shape{
	public void draw() {
		System.out.println("Drawing a Rectangle.");
	}
	public int getLength() {
		return 6;
	}
	public int getWidth() {
		return 5;
	}
	 public String getAreaDescription() {
	        return "Area of Rectangle is " + getLength() * getWidth() + ".";
	 }
}
public class Pgm6 {
	public static void main(String args[]) {
		ArrayList<Shape> list = new ArrayList<>();
		Shape sc1 = new Circle();
		Shape sc2 = new Rectangle();
		list.add(sc1);
		list.add(sc2);
		for(Shape s : list) {
			s.draw();
			System.out.println(s.getAreaDescription());
		if(s instanceof Circle) {
			Circle  c = (Circle) s;
			System.out.println("Radius : " + c.getRadius());
		}else if(s instanceof Rectangle) {
			Rectangle r = (Rectangle) s;
			System.out.println("Length : " + r.getLength());
			System.out.println("Width : " + r.getWidth());
			}
		System.out.println();
		}
		
	}
}

