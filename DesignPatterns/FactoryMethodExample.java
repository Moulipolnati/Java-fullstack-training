package com.desigh;
//Product (Abstract Class)
//This defines the common interface for all vehicles
abstract class Vehicle {

 // Abstract method that each vehicle must implement
 public abstract void printVehicle();
}


//Concrete Product 1
//Represents Two Wheeler vehicle
class TwoWheeler extends Vehicle {

 // Implementation of abstract method
 public void printVehicle() {
     System.out.println("I am Two Wheeler");
 }
}


//Concrete Product 2
//Represents Four Wheeler vehicle
class FourWheeler extends Vehicle {

 // Implementation of abstract method
 public void printVehicle() {
     System.out.println("I am Four Wheeler");
 }
}


//Factory Interface (Creator)
//Declares the factory method
interface VehicleFactory {

 // Factory method that returns Vehicle object
 Vehicle createVehicle();
}


//Concrete Factory 1
//Creates TwoWheeler objects
class TwoWheelerFactory implements VehicleFactory {

 // Overriding factory method
 public Vehicle createVehicle() {
     return new TwoWheeler();
 }
}


//Concrete Factory 2
//Creates FourWheeler objects
class FourWheelerFactory implements VehicleFactory {

 // Overriding factory method
 public Vehicle createVehicle() {
     return new FourWheeler();
 }
}


//Client Class
//This class uses the factory to create vehicles
class Client {

 private Vehicle vehicle;

 // Constructor receives factory object
 public Client(VehicleFactory factory) {

     // Factory creates the object
     vehicle = factory.createVehicle();
 }

 // Return created vehicle
 public Vehicle getVehicle() {
     return vehicle;
 }
}


//Main Class (Driver Program)
public class FactoryMethodExample {

 public static void main(String[] args) {

     // Create factory for Two Wheeler
     VehicleFactory twoFactory = new TwoWheelerFactory();

     // Client uses factory to create object
     Client client1 = new Client(twoFactory);

     // Get vehicle and call method
     Vehicle v1 = client1.getVehicle();
     v1.printVehicle();


     // Create factory for Four Wheeler
     VehicleFactory fourFactory = new FourWheelerFactory();

     // Client uses factory to create object
     Client client2 = new Client(fourFactory);

     // Get vehicle and call method
     Vehicle v2 = client2.getVehicle();
     v2.printVehicle();
 }
}