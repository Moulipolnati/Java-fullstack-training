package com.desigh;
//Prototype Design Pattern Example

//Step 1: Prototype interface
interface Prototype {

 // clone method
 Prototype clone();

}

//Step 2: Concrete Prototype
class Student implements Prototype {

 int id;
 String name;

 // Constructor
 Student(int id, String name) {
     this.id = id;
     this.name = name;
 }

 // Clone method
 public Prototype clone() {

     // Creating copy of existing object
     return new Student(this.id, this.name);

 }

 // Display method
 void show() {
     System.out.println("ID: " + id + " Name: " + name);
 }
}

//Step 3: Client
public class PrototypePatternExample {

 public static void main(String[] args) {

     // Creating original object
     Student s1 = new Student(1, "Mouli");

     // Cloning the object
     Student s2 = (Student) s1.clone();

     // Display both objects
     s1.show();
     s2.show();

 }
}