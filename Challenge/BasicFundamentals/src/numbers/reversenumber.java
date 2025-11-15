package numbers;

import java.util.Scanner;

public class reversenumber {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int  n = sc.nextInt();
	int temp = 0;
	while(n>0) {
		int dig = n%10;
		temp = temp*10+dig;
		n = n/10;
	}
	System.out.println(temp);
	
	}
}
