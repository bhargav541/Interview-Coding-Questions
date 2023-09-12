package com.practice.java;

import java.util.Scanner;

public class SwapTwoNumbersWithoutTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("The Swapped value of a and b is " +a+ " and " +b+ " "+ "respectively");
    }
}