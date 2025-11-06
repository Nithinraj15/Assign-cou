package method;

class Car {
	String model;
	int year;
	double fuelLevel = 50.0;
	static int totalCarsCreated;
	private static String manufacturerInfo = "Car Manufacturer: XYZ Motors";
	Car(String model, int year){
		this.model = model;
		this.year = year;
		totalCarsCreated++;
	}
	void startEngine() {
		System.out.println(model + " engine started.");
	}
	void drive(double distance) {
		fuelLevel -= distance * 0.1;
		System.out.println("fuel Level : " + fuelLevel);
		if(fuelLevel<0) {
			System.out.println("Out of fuel!");
			fuelLevel = 0;
		}
	}
	void refuel(double amount) {
		fuelLevel += amount;
		System.out.println("New Fuel Level : " + fuelLevel);
	}
	public static int getTotalCars() {
		return totalCarsCreated;
	}
	public static String getCarManufacturerInfo() {
		return manufacturerInfo;
	}
}
public class Main{
	public static void main(String args[]) { 
        Car car1 = new Car("Tesla Model 3", 2003);
        Car car2 = new Car("BMW X5", 2005);

        System.out.println("\nFor car1 (Tesla Model 3):");
        car1.startEngine();
        car1.drive(60.2);
        car1.refuel(120);

        System.out.println("\nFor car2 (BMW X5):");
        car2.startEngine();
        car2.drive(70.2);
        car2.refuel(130);

        System.out.println("\nStatic method calls:");
        System.out.println("Total number of cars: " + Car.getTotalCars());
        System.out.println("Manufacturer Info: " + Car.getCarManufacturerInfo());

        System.out.println("\nInstance vs Static Method Behavior:");
        System.out.println("car1 total cars: " + car1.getTotalCars()); 
        System.out.println("car2 total cars: " + car2.getTotalCars()); 
	}
}
