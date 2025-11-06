package LearningValue;
public class ImplicitExplicit {
	public static void main(String args[]) {
	int totalItems = 25;
	double itemPrice = 3.99;
	int unitsSoldToday = 18; 
	double potentialRevenue = totalItems*itemPrice;
	double actualRevenue = unitsSoldToday*itemPrice;
	double averageRevenuePerUnit = actualRevenue/unitsSoldToday;
	int actualRevenueWholeDollars = (int) actualRevenue;
	int integerAveragePrice = ((int) actualRevenue)/ unitsSoldToday;
	System.out.println("potentialRevenue : " + potentialRevenue);
	System.out.println("actualRevenue : " + actualRevenue);
	System.out.println("averageRevenuePerUnit : " + averageRevenuePerUnit);
	System.out.println("actualRevenueWholeDollars : " + actualRevenueWholeDollars);
	System.out.println("integerAveragePrice : " + integerAveragePrice);
	}
}

