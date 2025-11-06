package Operator_All;

public class OperatorPlayground {
	public static void main(String[] args){
		int num1 = 20;
		int num2 = 7;
		int x = 15;
		int val1 = 10;
		int val2 = 20;
		boolean condition1 = true;
		boolean condition2 = false;
		int counter = 5;
		int temperature = 25;
		System.out.println("---Arithmetic Operators---");
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2));
		System.out.println("num1 % num2 = " + (num1 % num2));
		System.out.println("---Assignment Operators---");
		x+=5;
		System.out.println("After x += 5: " + x);
		x-=5;
		System.out.println("After x -= 5: " + x);
		x*=5;
		System.out.println("After x *= 5: " + x);
		x/=5;
		System.out.println("After x /= 5: " + x);
		x%=5;
		System.out.println("After x %= 5: " + x);
		System.out.println("---Relational Operators---");
		System.out.println("val1 == val2: " + (val1 == val2));
		System.out.println("val1 != val2: " + (val1 != val2));
		System.out.println("val1 > val2:  " + (val1 > val2));
		System.out.println("val1 >= val2: " + (val1 >= val2));
		System.out.println("val1 < val2: " + (val1 < val2));
		System.out.println("val1 <= val2: " + (val1 <= val2));
		System.out.println("---Logical Operators---");
		System.out.println("condition1 && condition2: " + (condition1 && condition2));
		System.out.println("condition1 || condition2: " + (condition1 || condition2));
		System.out.println("!condition1: " + (!condition1));
		System.out.println("!condition2: " + (!condition2));
		System.out.println("---Unary Operators---");
		System.out.println("Initial value: " + counter);
        System.out.println("Prefix increment (++counter): " + (++counter)); 
        System.out.println("After prefix increment: " + counter);
        System.out.println("Postfix increment (counter++): " + (counter++)); 
        System.out.println("After postfix increment: " + counter); 
        System.out.println("Prefix decrement (--counter): " + (--counter)); 
        System.out.println("After prefix decrement: " + counter); 
        System.out.println("Postfix decrement (counter--): " + (counter--));
        System.out.println("After postfix decrement: " + counter);
        int positive = +counter;
        System.out.println("Unary plus (+counter): " + positive);
        int negative = -counter;
        System.out.println("Unary minus (-counter): " + negative); 
        String weather = (temperature > 25) ? "Hot" : "Cold" ;
		System.out.println("assigned string value: " + weather);
		
	}
}
