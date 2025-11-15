package InstanceOf;

import java.util.Scanner;

public class Rotation {
	public static void main(String args[]) {
		int [] arr = {1,2,3,4,5,6};
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
            int first = arr[0]; 
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = first;
        }
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
}
