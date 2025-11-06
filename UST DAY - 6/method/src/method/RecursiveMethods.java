package method;

public class RecursiveMethods {
	public static long factorial(int n) {
		if(n<0) {
			throw new IllegalArgumentException("Factorial cannot be find for the negative Number");
		}
		else if(n==0 || n==1) {
			return 1;
		}else{
			return  n * factorial(n - 1);
		}
	}
	public static long fibonacci(int n) {
		if(n<0) {
			throw new IllegalArgumentException("Fibonacci cannot be find for the negative Number");
		}else if(n==0){
			return 0;
		}else if(n==1) {
			return 1;
		}else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
public static void main(String args[]) {
	 System.out.println("Factorial Test Cases:");
        try {
            System.out.println("factorial(0): " + factorial(0)); 
            System.out.println("factorial(1): " + factorial(1));
            System.out.println("factorial(5): " + factorial(5)); 
            System.out.println("factorial(10): " + factorial(10)); 
            System.out.println("factorial(-3): " + factorial(-3)); 
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("\nFibonacci Test Cases:");
        try {
            System.out.println("fibonacci(0): " + fibonacci(0)); 
            System.out.println("fibonacci(1): " + fibonacci(1)); 
            System.out.println("fibonacci(5): " + fibonacci(5)); 
            System.out.println("fibonacci(10): " + fibonacci(10)); 
            System.out.println("fibonacci(-2): " + fibonacci(-2)); 
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
		
	}
}
