package com.practice.revision;
import java.util.*;
public class FactorialUsingMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the number");
        int n = sc.nextInt();
        int result = isFactorial(n);
        System.out.println("The factorial of"+" "+n+" "+"is"+" "+result);
    }
    public static int isFactorial(int n)
    {
        if ((n==0)||(n==1))
        {
            return 1;
        }
        else
        {
            return n*isFactorial(n-1);
        }

    }
}