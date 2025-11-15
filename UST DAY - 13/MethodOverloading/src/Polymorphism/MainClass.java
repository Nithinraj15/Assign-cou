package Polymorphism;

class AreaCalculator{
	double Area;
	public double calculateArea(double side) {
		Area = side*side;
		return Area;
	}
	double calculateArea(double length, double width) {
		Area = length * width;
		return Area;
	}
	public double calculateArea(double radius, boolean isCircle) {
		if(isCircle) {
		Area = Math.PI * radius * radius;
		}else {
		return 0.0;
		}
		return Area;
	}
	
}
public class MainClass {
	public static void main(String args[]) {
		AreaCalculator ac = new AreaCalculator();
		System.out.println(ac.calculateArea(4.5));
		System.out.println(ac.calculateArea(12.2, 13.1));
		System.out.println(ac.calculateArea(2.4, true));
		System.out.println(ac.calculateArea(2.4, false));
	}
}
