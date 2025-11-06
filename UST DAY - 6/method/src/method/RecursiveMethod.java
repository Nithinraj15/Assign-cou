package method;
import java.util.*;
public class RecursiveMethod {
	public static long factorial(int n) {
		if(n==0 || n==1) {
			return 1;
		}else{
			return  n * factorial(n - 1);
		}
	}
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int n;
	while(true) {
		System.out.println("Enter the Number to find factorial : ");
		n = sc.nextInt();
		if(n<0) {
			System.out.println("Invalid Input: Factorial is only defined for non-negative integers. Please try again.");
		}else {
			break;
		}
	}
	long fact = factorial(n);
	System.out.println("Factorial of " + n +  " (" + n + "!) is " + fact);
}
}


