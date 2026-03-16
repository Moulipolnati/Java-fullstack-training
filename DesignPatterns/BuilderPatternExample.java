package com.desigh;
//Product class
//This is the complex object that will be created step by step
class Computer {

 // Fields of the computer
 private String cpu;
 private String ram;
 private String storage;

 // Setter method for CPU
 public void setCPU(String cpu) {
     this.cpu = cpu;
 }

 // Setter method for RAM
 public void setRAM(String ram) {
     this.ram = ram;
 }

 // Setter method for Storage
 public void setStorage(String storage) {
     this.storage = storage;
 }

 // Method to display computer configuration
 public void displayInfo() {
     System.out.println("Computer Configuration:");
     System.out.println("CPU: " + cpu);
     System.out.println("RAM: " + ram);
     System.out.println("Storage: " + storage);
 }
}


//Builder Interface
//Defines the steps required to build the product
interface Builder {

 // Step 1: Build CPU
 void buildCPU();

 // Step 2: Build RAM
 void buildRAM();

 // Step 3: Build Storage
 void buildStorage();

 // Return the final product
 Computer getResult();
}


//Concrete Builder
//Implements the builder interface and builds a Gaming Computer
class GamingComputerBuilder implements Builder {

 // Create product object
 private Computer computer = new Computer();

 // Build CPU
 public void buildCPU() {
     computer.setCPU("Intel i9 Gaming CPU");
 }

 // Build RAM
 public void buildRAM() {
     computer.setRAM("16GB DDR4");
 }

 // Build Storage
 public void buildStorage() {
     computer.setStorage("1TB SSD");
 }

 // Return the completed computer
 public Computer getResult() {
     return computer;
 }
}


//Director Class
//Controls the order in which the product is built
class ComputerDirector {

 // Method that constructs the computer
 public void construct(Builder builder) {

     // Call builder methods step by step
     builder.buildCPU();
     builder.buildRAM();
     builder.buildStorage();
 }
}


//Client / Main Class
//This class starts the building process
public class BuilderPatternExample {

 public static void main(String[] args) {

     // Create builder object
     GamingComputerBuilder builder = new GamingComputerBuilder();

     // Create director object
     ComputerDirector director = new ComputerDirector();

     // Director builds the computer
     director.construct(builder);

     // Get the final product
     Computer computer = builder.getResult();

     // Display the computer configuration
     computer.displayInfo();
 }
}