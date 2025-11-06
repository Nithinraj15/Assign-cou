package array;
public class StudentScore {
	public static void main(String[] args) {
		int[][] studentScores = new int[3][]; 
	    studentScores[0] = new int[] {85, 92, 78, 65};  
	    studentScores[1] = new int[] {70, 95};          
	    studentScores[2] = new int[] {88, 72, 90, 81, 75};  
	    for (int i = 0; i < studentScores.length; i++) {
	    	System.out.print("Student " + (i + 1) + " Scores: ");
	    	for (int j = 0; j < studentScores[i].length; j++) {
	    		System.out.print(studentScores[i][j] + " ");
	            }
	            System.out.println();  
	        }
	        for (int i = 0; i < studentScores.length; i++) {
	            int sum = 0;
	            for (int j = 0; j < studentScores[i].length; j++) {
	                sum += studentScores[i][j];  
	            }
	            double average = sum / (double) studentScores[i].length;  
	            System.out.println("Student " + (i + 1) + " - Sum: " + sum + ", Average: " + average);
	        }
	   }
}

