package iSAvsHAsArelationship;
class Vehicle1{
	private String brand;
	Vehicle1(String brand){
		this.brand = brand;
	}
	public void start() {
		System.out.println("The vehicle starts.");
	}
	public String getBrand() {
		return brand;
	}
}
class Car1 extends Vehicle1{
	private String model;
	Car1(String brand,String model){
		super(brand);
		this.model = model;
	}
	public void start() {
		System.out.println("The " + getBrand() + " " + model + " car starts with a roar!");
	}
	public void drive() {
		System.out.println("The " + getBrand() + " " +  model + " car is driving.");
	}
}
public class ExtendsKey {
	public static void main(String args[]) {
		Vehicle1 myBike = new Vehicle1("Bicycle Brand");
		myBike.start();
		Car1 myCar = new Car1("Toyota", "Camry");
		myCar.drive();
		myCar.start();
	}
}
