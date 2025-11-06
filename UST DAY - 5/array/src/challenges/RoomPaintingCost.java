package challenges;
import java.util.Scanner;
public class RoomPaintingCost {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int width = sc.nextInt();
		int height = sc.nextInt();
		int noOfDoor = sc.nextInt();
		int noOfWindows = sc.nextInt();
		int lenwin = sc.nextInt();
		int widwin = sc.nextInt();
		int lenDoo = sc.nextInt();
		int widDoo = sc.nextInt();
		int costofpainWal = sc.nextInt();
	}
}

//The third line of the input contains an integer that corresponds to the number of Windows.
//The fourth line of the input contains 2 integers that corresponds to the length and width of the door, respectively.
//The fifth line of the input contains 2 integers that corresponds to the length and width of the window, respectively.
//The sixth line of the input contains an integer that corresponds to the cost of painting the wall per sq. meter.