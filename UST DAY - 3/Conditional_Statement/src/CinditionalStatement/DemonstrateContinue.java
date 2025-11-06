package CinditionalStatement;

public class DemonstrateContinue {
	public static void main(String[] args) {
		for(int j=1; j<=15; j++) {
			if(j%3==0) {
				continue;
			}else {
				System.out.println("Printed number: " + j);
			}
		}
		System.out.println("Loop 2 finished");
	}
}