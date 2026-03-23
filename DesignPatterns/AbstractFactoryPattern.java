package com.desigh;
//Abstract Products
abstract class Car {
 abstract void assemble();
}

abstract class CarSpecification {
 abstract void display();
}

//Concrete Products
class Sedan extends Car {
 void assemble() {
     System.out.println("Assembling Sedan car.");
 }
}

class Hatchback extends Car {
 void assemble() {
     System.out.println("Assembling Hatchback car.");
 }
}

class NorthAmericaSpecification extends CarSpecification {
 void display() {
     System.out.println("North America Car Specification: Safety features compliant with local regulations.");
 }
}

class EuropeSpecification extends CarSpecification {
 void display() {
     System.out.println("Europe Car Specification: Fuel efficiency and emissions compliant with EU standards.");
 }
}

//Abstract Factory
abstract class CarFactory {
 abstract Car createCar();
 abstract CarSpecification createSpecification();
}

//Concrete Factories
class NorthAmericaCarFactory extends CarFactory {
 Car createCar() {
     return new Sedan();
 }

 CarSpecification createSpecification() {
     return new NorthAmericaSpecification();
 }
}

class EuropeCarFactory extends CarFactory {
 Car createCar() {
     return new Hatchback();
 }

 CarSpecification createSpecification() {
     return new EuropeSpecification();
 }
}

//Main Class (IMPORTANT for Eclipse)
public class AbstractFactoryPattern {
 public static void main(String[] args) {

     CarFactory northFactory = new NorthAmericaCarFactory();
     Car car = northFactory.createCar();
     CarSpecification spec = northFactory.createSpecification();

     car.assemble();
     spec.display();

     System.out.println("-------------------");

     CarFactory europeFactory = new EuropeCarFactory();
     car = europeFactory.createCar();
     spec = europeFactory.createSpecification();

     car.assemble();
     spec.display();
 }
}