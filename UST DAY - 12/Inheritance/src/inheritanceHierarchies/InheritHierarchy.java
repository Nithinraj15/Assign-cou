package inheritanceHierarchies;
class Vehicle{
	protected String model;
	protected String make;
	protected int year;
	Vehicle(String make,String model,int year){
		this.make = make;
		this.model= model;
		this.year = year;
	}
	public void displayInfo() {
		System.out.println("make on : " + make);
		System.out.println("model : " + model);
		System.out.println("year : " + year);
	}
	public void startEngine() {
		System.out.println("The vehicle's engine starts.");
	}
}
class Car extends Vehicle{
	int numDoors;
	Car(String make,String model,int year,int numDoors){
		super(make,model,year);
		this.numDoors = numDoors;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Number of Doors: " + numDoors);
	}
	public void honk() {
		System.out.println("The car honks!");
	}
}
class Motorcycle extends Vehicle{
	boolean hasSidecar;
	Motorcycle(String make,String model,int year,boolean hasSidecar){
		super(make,model,year);
		this.hasSidecar = hasSidecar;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("hasSidecar..? " + hasSidecar);
	}
	public void wheelie() {
		System.out.println("The motorcycle performs a wheelie!");
	}
}

public class InheritHierarchy {
	public static void main(String args[]) {
		Car car = new Car("India","TATA",2005,4);
		car.displayInfo();
		car.startEngine();
		car.honk();
		Motorcycle motor = new Motorcycle("India","TATA",2005,true);
		motor.displayInfo();
	    motor.startEngine();
	    motor.wheelie();
	}
}
