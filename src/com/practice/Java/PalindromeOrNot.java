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

//B H A R G A V
//0 1 2 3 4 5 6
//
//i=0; n-1-i = 7 - 1 - 0 = 6
//i=1; n-1-i = 7 - 1 - 1 = 5
//i=2; n-1-i = 7 - 1 - 2 = 4