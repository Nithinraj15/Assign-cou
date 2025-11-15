package challenge;
import java.util.Scanner;
public class Treeheight {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int initialHeight = sc.nextInt();
		int MorningTime = sc.nextInt();
		int NightTime = sc.nextInt();
		int requiredHeight = sc.nextInt();
		int currentHeight = initialHeight;
		int days =0;
		while(currentHeight<requiredHeight) {
			days ++;
			currentHeight += MorningTime;
			if(currentHeight>=requiredHeight) {
				break;
			}
			
			currentHeight -= NightTime;
		}
			System.out.println(days);
			sc.close();
			
		}
	}
