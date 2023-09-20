package com.practice.Java;

import java.util.*;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the series term to be displayed");
        int n = sc.nextInt();
        System.out.println("The fibonacci series of" + " " + n + " " + "is");
        fibonacciSeries(n);
    }

    public static void fibonacciSeries(int n) {
        int firstterm = 0;
        int secondterm = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(firstterm + " ");
            int nextterm = firstterm + secondterm;
            firstterm = secondterm;
            secondterm = nextterm;
        }
    }
}