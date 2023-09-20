package com.practice.Java;

import java.util.*;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ((n >= 1) && (n % 2 != 0)) {
            System.out.println(n + " " + "is a prime number");
        } else {
            System.out.println(n + " " + "is not a prime number");
        }
    }
}