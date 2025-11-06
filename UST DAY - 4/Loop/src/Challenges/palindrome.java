package Challenges;

public class palindrome {
	public static void main(String arsf[]) {
		int num = 789;
		int empty = 0;
		while(num>0) {
			empty = 10*empty + num%10;
			num /= 10;
		}
		System.out.println(empty);
	}
}
