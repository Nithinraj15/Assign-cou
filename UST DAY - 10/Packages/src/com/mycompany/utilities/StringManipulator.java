package com.mycompany.utilities;

public class StringManipulator{
	public static String reverseString(String str){
		String rev = "";
		for(int i=str.length()-1;i>=0;i--) {
			rev += str.charAt(i);
		}
		return rev;
	}
	public static boolean isPalindrome(String str) {
		String original = str.toLowerCase();
        String reversed = reverseString(str).toLowerCase();
        return original.equals(reversed);
	}

}

