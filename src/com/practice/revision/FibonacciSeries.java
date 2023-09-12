package com.practice.revision;
import java.util.*;
public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the no of terms");
        int n =sc.nextInt();
        isFibonacci(n);
    }

    public static void isFibonacci(int n)
    {
        int FT = 0;
        int ST = 1;

        for (int i = 0; i <n; i++)
        {
            System.out.print(FT+" ");
            int NT = FT + ST;
            FT = ST;
            ST = NT;
        }
    }
}
