package list;
import java.util.LinkedList;
public class ShoppingList {
	public static void main(String args[]) {
		// Creating the LinkedList here as list
		LinkedList <String> list = new LinkedList<>();
		// Adding the elements to the list
		list.add("Milk");
		list.add("Bread");
		list.add("Eggs");
		list.add("Apples");
		System.out.println("Initial Shopping List: " + list); // printing the initial list
		list.remove("Bread"); // removing the specific item
		list.add("Cheese");
		// used to check the element is contains or not
		if(list.contains("Milk")) {
			System.out.println("Milk is on the list.");
		}else {
			System.out.println("Milk is not on the list.");
		}
		// To check the element
		System.out.println("Eggs is on : " + list.indexOf("Eggs"));
		// to setting the element to the specific index
		list.set(list.indexOf("Eggs"), "Organic Eggs");
		System.out.println("Final Shopping List: " + list);
		System.out.println("Size of the Shopping List: " + list.size());
	}
}
