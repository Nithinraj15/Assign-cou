class Product{
	private String productId;
	private String productName;
	private double price;
	private boolean inStock;
	public Product(){
		this.productId = "N/A";
		this.productName = "Unknown Product";
		this.price = 0.0;
		this.inStock = false;
	}
	public Product(String productId,String productName,double price,boolean inStock){
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.inStock = inStock;
	}
	public Product(String productId,String productName,double price){
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.inStock = true;
	}
	public void displayProductDetails() {
		System.out.println("Product Id: " + productId);
		System.out.println("Product Name: " + productName);
		System.out.println("Price: " + price);
		System.out.println("Stock Available?...: " + inStock);
	}
}
public class Constructors1 {
	public static void main(String args[]) {
		Product pro = new Product();
		pro.displayProductDetails();
		Product pro1 = new Product("SH12","Soap",45.43,false);
		pro1.displayProductDetails();
		Product pro2 = new Product("DH12","Dhal",60.09);
		pro2.displayProductDetails();
	}
}
