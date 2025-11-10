package com.mycompany.utilities;
import java.util.Scanner;
import java.util.Date;

public class ImportPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String Name = sc.nextLine();
		Date currentDate = new Date();
		System.out.println("Hello, " + Name + "! Today's date and time is: " + currentDate.toString());
	}
}
