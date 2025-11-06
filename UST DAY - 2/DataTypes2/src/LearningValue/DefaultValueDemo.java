package LearningValue;
class Item{
	int itemId;
	double itemPrice;
	boolean isAvailable;
	String itemName;
	char categoryCode;
}
public class DefaultValueDemo {
	public static void main(String args[]) {
	Item newIte = new Item();
	System.out.println("Item ID       : " + newIte.itemId);
    System.out.println("Item Price    : " + newIte.itemPrice);
    System.out.println("Is Available  : " + newIte.isAvailable);
    System.out.println("Item Name     : " + newIte.itemName);
    System.out.println("Category Code : " + newIte.categoryCode);
	}
}
