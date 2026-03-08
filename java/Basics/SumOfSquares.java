package com.basics;
import java.util.Scanner;

public class SumOfSquares {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int i = 1;
        int sum = 0;

        while(i <= n){
            sum = sum + (i * i);
            i++;
        }

        System.out.println("Sum of squares = " + sum);

    }
}
