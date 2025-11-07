class Product1{
	private String productID;
	private String name;
	private double price;
	Product(String productID, String name ,double price){
		this.productID = productID;
		this.name = name;
		this.price = price;
		 System.out.println("Product " + name + " (ID: " + productID + ") has been created.");
    }
	public void displayProductDetails() {
		System.out.println("Product Id: " + productID);
		System.out.println("Product Name: " + name);
		System.out.println("Price: " + price);
	}
	}
public class ObjectLifecycle {
	public static void main(String[] args) {
		Product laptop = new Product("P101", "Laptop", 1200.00);
		Product mouse = new Product("P102", "Wireless Mouse", 25.50);
		Product keyboard = new Product("P103", "Mechanical Keyboard", 80.00);
		laptop.displayProductDetails();// Now the 'laptop' reference points to a valid Product object.
		mouse.displayProductDetails();
		keyboard.displayProductDetails();
		// At this point, 'laptop' no longer references the Product object.
				// Attempting to call 'laptop.displayProductDetails()' now would throw a NullPointerException
				// because the 'laptop' reference is null, and there is no object to invoke the method on.
		laptop = null;
	
	}

}
