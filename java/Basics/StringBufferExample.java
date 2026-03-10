package com.basics;
public class StringBufferExample {

    public static void main(String[] args) {

        // Method 1: Create an empty StringBuffer object
        StringBuffer sb1 = new StringBuffer();
        sb1.append("Hello"); // append() adds text to the buffer
        System.out.println("Method 1: " + sb1);

        // Method 2: Create StringBuffer with initial string
        StringBuffer sb2 = new StringBuffer("Java");
        sb2.append(" Programming"); // modify the same object
        System.out.println("Method 2: " + sb2);

        // Method 3: Create StringBuffer with specific capacity
        StringBuffer sb3 = new StringBuffer(50); // capacity means size of buffer
        sb3.append("Capacity Example");
        System.out.println("Method 3: " + sb3);

        // Check capacity of the buffer
        System.out.println("Buffer capacity: " + sb3.capacity());

    }
}