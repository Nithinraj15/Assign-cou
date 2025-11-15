package InstanceOf;
import java.util.ArrayList;
// Abstract base class Vehicle
abstract class Vehicle {
    protected String name;  

    // Constructor to initialize the name
    Vehicle(String name) {
        this.name = name;
    }

    // Abstract method for movement
    public abstract void move();

    // Method to get the vehicle's name
    public String getName() {
        return name;
    }
}

// Concrete class Car extends Vehicle
class Car extends Vehicle {
    Car(String name) {
        super(name);  // Initialize the vehicle name using the superclass constructor
    }

  
    public void move() {
        System.out.println("The " + getName() + " is driving on the road.");
    }
}


class Bicycle extends Vehicle {
    Bicycle(String name) {
        super(name); 
    }

   
    public void move() {
        System.out.println("The " + getName() + " is pedaling on the path.");
    }
}

// Concrete class Airplane extends Vehicle
class Airplane extends Vehicle {
    Airplane(String name) {
        super(name);  
    }
  
    public void move() {
        System.out.println("The " + getName() + " is flying in the sky.");
    }
}

public class PolymorphicSystems {
    public static void main(String[] args) {
        // Create instances of Car Bicycle Airplane
        Vehicle car = new Car("Honda Civic");
        Vehicle bicycle = new Bicycle("Mountain Bike");
        Vehicle airplane = new Airplane("Boeing 747");

        // Create a collection to store Vehicle references
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);        
        vehicles.add(bicycle);    
        vehicles.add(airplane);  

        for (Vehicle vehicle : vehicles) {
            vehicle.move(); 
        }
    }
}
