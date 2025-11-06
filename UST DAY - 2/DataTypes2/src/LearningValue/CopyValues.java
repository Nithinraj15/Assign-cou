package LearningValue;

public class CopyValues {
	public static void changePrimitive(int value) {
		value =50;
		System.out.println("num 1 : " + value);
	}
	public static void main(String args[]) {
		int num1 = 10;
		int num2 = num1;
		num2 =20;
		System.out.println("Before Call");
		System.out.println("num 1 : " + num1);
		System.out.println("num 2 : " + num2);
		System.out.println("After Call");
		changePrimitive(num1);
	}
}
