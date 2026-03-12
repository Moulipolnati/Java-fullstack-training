package com.basics;
//Example program for StringBuilder

public class StringBuilderEx {

 public static void main(String[] args) {

     // Creating StringBuilder object
     StringBuilder sb = new StringBuilder("Java");

     // append() adds text at the end
     sb.append(" Programming");

     // insert() adds text at a specific position
     sb.insert(4, " Language");

     // replace() replaces characters
     sb.replace(0, 4, "Advanced");

     // reverse() reverses the string
     sb.reverse();

     // Print the final string
     System.out.println(sb);
 }
}