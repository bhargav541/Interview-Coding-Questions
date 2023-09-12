package com.practice.revision;
import java.util.*;
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s2 = new StringBuilder();
        System.out.println("Enter the string to reverse");
        String s1 = sc.nextLine();
        int n = s1.length();
        for (int i = n-1; i >= 0; i--)
        {
            s2.append(s1.charAt(i));
        }
        System.out.println("The reverse of the entered string is"+" "+s2);
    }
}