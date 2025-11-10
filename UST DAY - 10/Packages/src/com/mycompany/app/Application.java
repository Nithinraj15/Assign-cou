package com.mycompany.app;
import com.mycompany.utilities.StringManipulator;
public class Application {
	public static void main(String args[]) {
		String originalString = "hello";
        String reversedString = StringManipulator.reverseString(originalString);
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
        
        String palindrome = "madam";
        boolean isPalindromeResult = StringManipulator.isPalindrome(palindrome);
        System.out.println("\"" + palindrome + "\" is a palindrome: " + isPalindromeResult);
        
        String nonPalindrome = "world";
        boolean isNonPalindromeResult = StringManipulator.isPalindrome(nonPalindrome);
        System.out.println("\"" + nonPalindrome + "\" is a palindrome: " + isNonPalindromeResult);
    }
}

