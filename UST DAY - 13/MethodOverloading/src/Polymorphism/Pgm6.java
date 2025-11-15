package Polymorphism;
import java.util.ArrayList;
abstract class Shape11{
	public abstract void draw();
	public String getAreaDescription() {
		return "Area is not specified for a generic shape.";
	}
}
class Circle11 extends Shape11{
	public void draw() {
		System.out.println("Drawing a Circle.");
	}
	public String getRadius() {
		return "This is a Circle with radius: 5";
	}
	 public String getAreaDescription() {
	        return "Area is not specified for a generic shape.";
	 }
}
class Rectangle11 extends Shape11{
	public void draw() {
		System.out.println("Drawing a Rectangle.");
	}
	public String getLength() {
		return "This is a Rectangle with length: 10 and width: 4";
	}
	 public String getAreaDescription() {
	        return "Area is not specified for a generic shape.";
	 }
}
public class Pgm6 {
	public static void main(String args[]) {
		ArrayList<Shape11> list = new ArrayList<>();
		Shape11 sc1 = new Circle11();
		Shape11 sc2 = new Rectangle11();
		list.add(sc1);
		list.add(sc2);
		for(Shape11 s : list) {
			s.draw();
			System.out.println(s.getAreaDescription());
		if(s instanceof Circle11) {
			Circle11  c = (Circle11) s;
			System.out.println(c.getRadius());
		}else if(s instanceof Rectangle11) {
			Rectangle11 r = (Rectangle11) s;
			System.out.println(r.getLength());
			}
		}
		
	}
}

