package array;

public class ScoreAnalyzer {
	public static void main(String args[]) {
		int[] studentScores = {85, 72, 90, 65, 50, 95, 78, 88, 60, 100};
		int highScore = Integer.MIN_VALUE;
		int lowScore = Integer.MAX_VALUE;
        int totalSum = 0;
        double averageScore = 0;
        int count = 0;
		System.out.println("All Student Scores: ");
		for(int i=0; i<studentScores.length; i++) {
			System.out.println(studentScores[i]);
			if(highScore < studentScores[i]) {
				highScore = studentScores[i];
			}	
			if(lowScore > studentScores[i]) {
				lowScore = studentScores[i];
			}	
            totalSum += studentScores[i];
            if(studentScores[i] >= 60) {
            	count++;
		}
		}
        averageScore = (double) totalSum/studentScores.length;
        System.out.println("Highest Score:: " + highScore);
		System.out.println("Lowest Score: " + lowScore);
        System.out.println("Average Score: " + averageScore);
        System.out.println("Number of Passing Students: " + count);
}
}
