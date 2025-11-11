package iSAvsHAsArelationship;
class Vehicle2{
	private String make;
	private String model;
	private int year;
	Vehicle2(String make,String model,int year){
		this.make = make;
		this.model = model;
		this.year = year;
	}
	public void displayVehicleInfo() {
		System.out.println("make on : " + make);
		System.out.println("model : " + model);
		System.out.println("year : " + year);
	}
}
class Car2 extends Vehicle2{
	private int numberOfDoors;
	Car2(String make,String model,int year,int numberOfDoors){
		super(make,model,year);
		this.numberOfDoors = numberOfDoors;
	}
	public void displayVehicleInfo() {
		super.displayVehicleInfo();
		System.out.println("Number of Doors: " + numberOfDoors);
	}
}
class ElectricCar2 extends Car2{
	private int batteryCapacityKWh;
	ElectricCar2(String make,String model,int year,int numberOfDoors,int batteryCapacityKWh){
		super(make,model,year,numberOfDoors);
		this.batteryCapacityKWh = batteryCapacityKWh;
	}
	public void displayVehicleInfo() {
		super.displayVehicleInfo();
		System.out.println("battery Capacity KWh: " + batteryCapacityKWh);
	}
}
public class SuperClass {
	public static void main(String args[]) {
		Vehicle2 m1 = new Vehicle2("Toyota","Camry", 2023);
		m1.displayVehicleInfo();
		Car2 m2 = new Car2("Toyota","Camry", 2023, 4);
		m2.displayVehicleInfo();
		ElectricCar2 m3 = new ElectricCar2("Toyota","Camry", 2023, 4, 240);
		m3.displayVehicleInfo();
	}
}
