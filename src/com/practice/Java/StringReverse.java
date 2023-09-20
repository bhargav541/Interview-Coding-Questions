package com.practice.Java;

import java.util.*;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to reverse");
        String str1 = sc.nextLine();
        StringBuilder str2 = new StringBuilder();

        int n = str1.length();
        for (int i = n - 1; i >= 0; i--) {
            str2.append(str1.charAt(i));
        }
        System.out.println("The reverse of entered string is" + " " + "=" + " " + str2);
    }
}