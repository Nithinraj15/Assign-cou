package Polymorphism;
import java.util.ArrayList;
import java.util.List;
class Vehicle1{
    public void startEngine(){
        System.out.println("Vehicle engine starting...");
    }
}
class Car1 extends Vehicle1{
    public void startEngine(){
        System.out.println("Car engine starting with key ignition.");
    }
}
class Motorcycle1 extends Vehicle1{
    public void startEngine(){
        System.out.println("Motorcycle engine starting with kick-start.");
    }
}
class pgm4{
    public static void main(String args[]){
        ArrayList<Vehicle1> vehicles = new ArrayList<>();
        Vehicle1 vc = new Vehicle1();
        Vehicle1 car = new Car1();
        Vehicle1 Mc = new Motorcycle1();
        vehicles.add(vc);
        vehicles.add(car);
        vehicles.add(Mc);
        
        for(Vehicle1 v : vehicles) {
        	v.startEngine();
        }
    }
}