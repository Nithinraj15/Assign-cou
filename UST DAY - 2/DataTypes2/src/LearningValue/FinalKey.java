package LearningValue;
class CircleCalculator{
	 final static double PI = 3.14159;
	 public double calculateArea(double radius) {
		    return PI * radius * radius;
		}
	 public double calculateCircumference(double radius) {
		 return 2*PI*radius;
	 } 
	 }
public class FinalKey {
	public static void main(String args[]) {
		CircleCalculator cir = new CircleCalculator();
		System.out.println("Area of circle with radius 5.0 : " + cir.calculateArea(5.0));
		System.out.println("Circumference of circle with radius 5.0 : " + cir.calculateCircumference(5.0));
	}

}
