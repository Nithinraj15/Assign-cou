package method;
import java.util.Scanner;
class Printer{
	public static void print(int value) {
		System.out.println("Printing int: " + value);
		}
	public static void print(double value) {
		System.out.println("Printing double: " + value);
		}
	public static void print(String message) {
		System.out.println("Printing String: " + message);
		}
	public static void print(boolean value) {
		System.out.println("Printing boolean: " + value);
		}
}
public class MethodOverloading {
	public static void main(String[] args) {
	Scanner sco = new Scanner(System.in);
	int a = sco.nextInt();
	Printer.print(a);
	double b = sco.nextDouble();
	Printer.print(b);
	sco.nextLine();
	String c = sco.nextLine();
	Printer.print(c);
	boolean d = sco.nextBoolean();
	Printer.print(d);
	}
}
