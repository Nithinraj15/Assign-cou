package method;

import java.util.Arrays;

public class Stringsd {
	public static void main(String[] args) {
		String [] str = {"cat", "three", "seven", "elitebook","on"};
		String temp = "";
		System.out.println("UnSorted Array : " + Arrays.toString(str));
		for(int i=0;i<str.length-1;i++) {
			for(int j=0; j<str.length-i-1;j++) {
			if(str[j].length() > str[j+1].length()) {
				temp = str[j];
				str[j] = str[j+1];
				str[j+1] = temp;
			}
		}
		}
		String[] ret = Arrays.sort(str);
		System.out.println("Sorted Array : " + Arrays.toString(ret));
	}
}
