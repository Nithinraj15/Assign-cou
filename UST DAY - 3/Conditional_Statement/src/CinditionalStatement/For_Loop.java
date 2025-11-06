package CinditionalStatement;

public class For_Loop {
	public static void main(String[] args) {
		for(int i=10; i>=1; i--) {
			System.out.println(i);
		}
		System.out.println("Blast Off!");
		
		int j=1;
		int sum =0;
		while(j<=20) {
			if(j%2==0) {
				sum += j;
			}
			j++;
		}
		System.out.println(sum);
		
		for(int k=1; k<=5; k++){
			System.out.println("Multiplication Table for " + k + ":");
			for(int l=1; l<=10; l++) {
				System.out.println(k + " * " + l + " = " + k*l);
			}
		}
	}
}
