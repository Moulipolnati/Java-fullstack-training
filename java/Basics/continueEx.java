package com.basics;
public class continueEx {

    public static void main(String[] args) {

        // Loop from 1 to 10
        for(int i = 1; i <= 10; i++){

            // Check if number is odd
            if(i % 2 != 0){
                continue;  // skip odd numbers
            }

            // Print even numbers
            System.out.println(i);

        }

    }

}
