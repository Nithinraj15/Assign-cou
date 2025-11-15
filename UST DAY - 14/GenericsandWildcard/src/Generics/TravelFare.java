package Generics;
import java.util.Scanner;
public class TravelFare {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int weightage = sc.nextInt();
		int fareage = sc.nextInt();
		int trainfare = sc.nextInt();
		int traintime = sc.nextInt();
		int Busfare = sc.nextInt();
		int Bustime = sc.nextInt();
		int Flightfare = sc.nextInt();
		int Flighttime = sc.nextInt();
		int result = 0;
		
		int choTrain = weightage*traintime+fareage*trainfare;
		int choBus = weightage*Bustime+fareage*Busfare;
		int choFlight = weightage*Flighttime+fareage*Flightfare;
		
		if(choTrain <= choBus && choTrain <= choFlight) {
			System.out.println("Train");
		}else if(choBus <= choTrain && choBus <= choFlight) {
			System.out.println("Bus");
		}else if(choFlight <= choTrain && choFlight <= choBus) {
			System.out.println("Flight");
		}
	}
}
