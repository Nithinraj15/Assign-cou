package iSAvsHAsArelationship;
class Vehicle{
	
	protected int Speed;
	
	public Vehicle(int Speed) {
		this.Speed = Speed;
	}
	
	public void accelerate(){
		System.out.println("Vehicle is accelerating!");
	}
	
	public int getSpeed() {
		return Speed;
	}
	
}

class Engine{
	
	private int horsepower;
	
	Engine(int horsepower){
		this.horsepower = horsepower;
	}
	
	public void start() {
		System.out.println("Engine with " + horsepower + " HP started!");
	}
	
	public int gethorsePower() {
		return horsepower;
	}
	
}

class Car extends Vehicle{
	
	private int numDoors;
	private Engine engine;
	
	Car(int Speed, int numDoors,Engine engine){
		
		super(Speed);
		this.engine = engine;
		this.numDoors = numDoors;
	}	
	public void startCar() {
		engine.start();
	}
	public void accelerate() {
        System.out.println("Car is accelerating with " + Speed + " km/h!");
    }
	
	public int numDoors() {
		return numDoors;
	}
	public Engine engine() {
		return engine;
	}
}


public class Inheritance {

	public static void main(String[] args) {
		Engine eng = new Engine(120);
		Car car = new Car(130,4,eng);
		car.accelerate();
		car.startCar();
	}

}

