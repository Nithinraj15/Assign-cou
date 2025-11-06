package Challenges;

import java.util.Scanner;
public class Dice_1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value 1: ");
		int value1 = sc.nextInt();
		System.out.println("Enter Value 2: ");
		int value2 = sc.nextInt();	
		int pointScored = 0;
		if(value1!=value2) {
			pointScored = value1+value2;
			System.out.println("The points scored is : " + pointScored);
		}else {
			pointScored = 2*(value1+value2);
			System.out.println("The points scored is : " + pointScored);
		}
	}
}
