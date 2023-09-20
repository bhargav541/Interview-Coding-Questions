package com.practice.java;

import java.util.*;

public class FactorialOfANumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the number whose factorial need to be found");
        int num = sc.nextInt();
        int result = findFactorial(num);
        System.out.println("The Factorial of" + " " + num + " " + "=" + " " + result);
    }

    public static int findFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * findFactorial(n - 1);
        }
    }
}