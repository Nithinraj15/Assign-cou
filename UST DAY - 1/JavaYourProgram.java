import java.util.Scanner;
public class JavaYourProgram {
	public static void main(String[] args) {
		int a,b;
		if(args.length == 2) {
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
		}else {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the first number: " );
			a = sc.nextInt();
			System.out.println("Enter the second number: ");
			b = sc.nextInt();
		}
		int result = a + b;
		System.out.println("The sum of " + a + " and " + b + " is " + result + ".");
		}
	}
