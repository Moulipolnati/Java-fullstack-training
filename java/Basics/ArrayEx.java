package com.basics;
import java.util.Scanner;

public class ArrayEx {

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Ask user for array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Create array of size n
        int[] arr = new int[n];

        int sum = 0; // variable to store sum

        // Loop to take input from user
        for(int i = 0; i < n; i++){

            System.out.print("Enter element " + (i+1) + ": ");

            arr[i] = sc.nextInt(); // store value in array

        }

        // Loop to calculate sum of elements
        for(int i = 0; i < n; i++){

            sum = sum + arr[i]; // add element to sum

        }

        // Print sum
        System.out.println("Sum of elements : " + sum);

        sc.close(); // close scanner

    }

}
