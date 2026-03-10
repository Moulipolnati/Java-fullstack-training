package com.basics;
public class RandomArray {

    public static void main(String[] args) {

        // Create an array of size 5
        int[] arr = new int[5];

        // Loop through the array
        for(int i = 0; i < arr.length; i++){

            // Generate a random number between 0 and 99
            arr[i] = (int)(Math.random() * 100);

            // Print the random number stored in array
            System.out.println(arr[i]);

        }

    }

}
