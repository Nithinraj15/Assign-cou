package challenge;
import java.util.*;
public class ListDiamond {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr = new int[n];
	f
		arrs = sc.nextInt();
	}
	int max_val = Integer.MIN_VALUE;
	int index = -1;
	for(int i=0;i<n;i++) {
		if(arr[i]%2==0) {
			if(arr[i]>max_val) {
				max_val = arr[i];
				index = i;
			}
		}
	}
	System.out.println(index);
}
}
