package method;
import java.util.Scanner;
public class MessageProcessor {
	public static void printWelcomeMessage(String user){
		System.out.println("Welcome, " + user + "!");
	}
	public static String generateFormattedMessage(String prefix, String content) {
		String res = prefix + content;
		return res;
	}
	public static int addTwoNumbers(int n1, int n2) {
		int sum = n1 + n2;
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String userName = sc.nextLine();
		printWelcomeMessage(userName);
		int output1 = addTwoNumbers(15,23);
		String output2 = generateFormattedMessage("ALERT: ","System offline.");
		System.out.println(output2);
		System.out.println(output1);
	}
}
