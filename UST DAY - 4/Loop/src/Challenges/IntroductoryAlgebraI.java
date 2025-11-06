package Challenges;

import java.util.Scanner;
public class IntroductoryAlgebraI {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value 1: ");
		int value1 = sc.nextInt();
		System.out.println("Enter Value 2: ");
		int value2 = sc.nextInt();
		int a = (int) Math.log10(Math.abs(value1))+1;
		int b = (int) Math.log10(Math.abs(value2))+1;
		if(a == 2 && b == 2) {
			if((value1>0 && value2<0) || (value2>0 && value1<0)) {
				System.out.println("Correct");
			}else {
				System.out.println("InCorrect");
			}
		}else {
			System.out.println("Invalid");
		}
	}
}
 