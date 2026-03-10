package com.basics;
public class StringComparison {

    public static void main(String[] args) {

        // String literals
        String a = "Java";
        String b = "Java";

        // Compare memory addresses
        System.out.println(a == b);   // true (same object in string pool)

        // Create new objects
        String c = new String("Java");
        String d = new String("Java");

        // Compare memory addresses
        System.out.println(c == d);   // false (different objects)

        // Compare actual content
        System.out.println(c.equals(d)); // true (same text)

    }

}