package array;

public class Array_1D {
	public static void main(String args[]) {
		int [] matchScores = {65, 42, 10, 88, 30, 5};
		int totalRuns = 0;
		for(int arr : matchScores) {
			totalRuns += arr;
		}
		System.out.println("Total Runs Scored by 6 Bats Man is : " + totalRuns);
		int Largest = matchScores[0];
		for(int arr1 : matchScores) {
			if(arr1 > Largest) {
				Largest = arr1;
			}
		}System.out.println("Largest run : " + Largest);
	}
}
