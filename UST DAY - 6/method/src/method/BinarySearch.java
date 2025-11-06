package method;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static int binarySearches(int arr[],int target) {
		int left =0;
		int right = arr.length-1;
		
		while(left<=right) {
			int mid = left+(right-left)/2;
			if(arr[mid]==target) {
				return mid;
			}else if(arr[mid]<target) {
				left = mid+1;
			}else {
				right = mid-1;
			}
		}
		return -1;
	}
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Array size : ");
	int n = sc.nextInt();
	System.out.println("Enter the Array Element : ");
	int [] arr = new int [n];
	for(int i=0; i<arr.length;i++) {
		arr[i] = sc.nextInt();
		}
	System.out.println(Arrays.toString(arr));
	System.out.println("target : ");
	int target = sc.nextInt();
	int result = binarySearches(arr,target);
	if(result == -1) {
		System.out.println("Element Not Found!..");
	}else {
		System.out.println("Element found at " + result);
	}
}
}
