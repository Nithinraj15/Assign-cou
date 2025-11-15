package Generics;

import java.util.Arrays;

public class Anagaram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Dog";
		String str2 = "God";
		char[] arr1 = str1.toLowerCase().toCharArray();
		char[] arr2 = str2.toLowerCase().toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		str1 = new String(arr1);
		str2 = new String(arr2);
	
		if(str1.equals(str2)) {
			System.out.println("true");
		}
	}

}
