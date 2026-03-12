package com.desigh;
//Singleton Design Pattern Example

//Singleton class
class Singleton {

 // Step 1: Static variable to store the single instance of the class
 // Only one object of this class will exist
 private static Singleton instance;

 // Step 2: Private constructor
 // This prevents other classes from creating objects using 'new'
 private Singleton(){
     System.out.println("Singleton is instantiated");
 }

 // Step 3: Public static method to provide access to the instance
 // This method creates the object only once and returns the same object every time
 public static Singleton getInstance(){

     // Check if instance is not yet created
     if(instance == null)
         instance = new Singleton();

     // Return the existing instance
     return instance;
 }

 // Method to demonstrate functionality
 public void showMessage(){
     System.out.println("Singleton Pattern Example");
 }
}

//Main class to test Singleton Pattern
public class SingletonEx {

 public static void main(String[] args){

     // Get the singleton instance
     Singleton obj = Singleton.getInstance();

     // Call method using the singleton object
     obj.showMessage();
 }
}