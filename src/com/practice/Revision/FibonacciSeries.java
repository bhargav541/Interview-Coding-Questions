package com.practice.Revision;

import java.util.*;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacciSeries(n);
    }

    public static void fibonacciSeries(int n) {

        int firstTerm = 0;
        int secondTerm = 1;

        for (int i = 0; i < n; i++) {
            System.out.println(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}