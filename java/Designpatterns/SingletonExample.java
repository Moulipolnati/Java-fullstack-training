package com.desigh;

// Singleton class
class Singleton {

    // Step 1: create a single static object of the class
    // static means this object belongs to the class, not to instances
    private static Singleton instance = new Singleton();

    // Step 2: private constructor prevents object creation from outside
    // so no one can write: new Singleton()
    private Singleton() {
        System.out.println("Singleton object created");
    }

    // Step 3: public method to access the single object
    // this method always returns the same instance
    public static Singleton getInstance() {
        return instance;
    }
}

// Main class to test Singleton pattern
public class SingletonExample {

    public static void main(String[] args) {

        // getting singleton object
        Singleton obj1 = Singleton.getInstance();

        // getting the object again
        Singleton obj2 = Singleton.getInstance();

        // checking if both objects are the same
        // if true → only one object exists
        System.out.println(obj1 == obj2);
    }
}