package method;
class Calculator{
	public static int add(int a, int b) {
		int sum = a+b;
		return a+b;
	}
	public static double add(double a, double b) {
		double sum = a+b;
		return sum;
	}
	public static double add(int a, double b) {
		double sum = a+b;
		return sum;
	}
}
public class Calculator_1 {
	public static void main(String[] args) {
		int res1 = Calculator.add(10,20);
		double res2 = Calculator.add(10.25, 10.25);
		double res3 = Calculator.add(10, 10.25);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
}
}
