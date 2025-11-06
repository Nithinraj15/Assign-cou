package method;
public class ShapeCalculator{
	public static int calculateRectangleArea(int length, int width) {
		int calculatedarea = length*width;
		return calculatedarea;
	}
	public static double calculateCircleCircumference(double radius) {
		double calculatedcircumference = 2 * Math.PI * radius;
		return calculatedcircumference;
	}
	public static String getShapeName(int numberOfSides) {
		 if(numberOfSides==3) {
			 return "Triangle";
		 }else if(numberOfSides == 4) {
			 return "Quadrilateral";
		 }else {
			 return "Unknown Shape";	 
		 }
	}
	public static boolean isEven(int number) {
		return number%2==0;
	}
	public static void main(String[] args) {
		
		System.out.println("Calculated Area : " + ShapeCalculator.calculateRectangleArea(10,12));
		System.out.println("Calculated Circumference : " + ShapeCalculator.calculateCircleCircumference(10.5));
		System.out.println("Name of the Shape is : " + ShapeCalculator.getShapeName(4));
		System.out.println("is even (4) ? : " + ShapeCalculator.isEven(4));
	}
}
