package com.practice.Java;

import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check palindrome");
        String str = sc.nextLine();
        if (isPalindrome(str)) {
            System.out.println(str + " " + "is a Palindrome");
        } else {
            System.out.println(str + " " + "is not a Palindrome");
        }
    }

    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}