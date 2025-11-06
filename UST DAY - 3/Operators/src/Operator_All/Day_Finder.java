package Operator_All;

public class Day_Finder {
	    public static void main(String[] args) {
	        int day = 15;
	        int month = 12;
	        int year = 2003;
	        // Adjust month and year for Zeller's formula
	        if (month < 3) {
	            month += 12;
	            year -= 1;
	        }

	        int K = year % 100;
	        int J = year / 100;

	        int h = (day + (13 * (month + 1)) / 5 + K + K / 4 + J / 4 + 5 * J) % 7;

	        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
	        System.out.println("The day of the week is: " + days[h]);
	    }
	}

