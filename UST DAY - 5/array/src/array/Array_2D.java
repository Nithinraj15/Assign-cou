package array;
public class Array_2D {
	public static void main(String args[]) {
		int [][] seasonMatchScores = {{180}, {165}, {205}, {190}};
		int totalRuns = 0;
		for(int i=0; i<seasonMatchScores.length; i++) {
			totalRuns += seasonMatchScores[i][0];
		}
		System.out.println("Total Runs : " + totalRuns);
		double averageRuns = (double)totalRuns/seasonMatchScores.length;
		System.out.println("Average Match Score : " + averageRuns);
		}
}

