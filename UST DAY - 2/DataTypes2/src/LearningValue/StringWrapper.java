package LearningValue;

public class StringWrapper {
	public static void main(String args[]) {
		String num = "12345";
		int a = Integer.parseInt(num);
		System.out.println("Parsed int from String " + a);
		String dob = "98.76";
		double b = Double.valueOf(dob);
		System.out.println("Converted Double object from String " + b);
	}
}
