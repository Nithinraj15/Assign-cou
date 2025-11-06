package array;

public class Linear_Search {  
		public static int linearSearch(int[] arr, int target) {   
			for (int i = 0; i < arr.length; i++) {    
				if (arr[i] == target) {       
					return i; 
					}  
				}  
			return -1; // Target not found 
				}  
		public static void main(String[] args) {   
					int[] numbers = {4, 2, 7, 1, 9, 5};   
					int target1 = 7;   
					int target2 = 3;   
	System.out.println("Target " + target1 + " found at index: " + linearSearch(numbers, target1));
	System.out.println("Target " + target2 + " found at index: " + linearSearch(numbers, target2));
	}
}
