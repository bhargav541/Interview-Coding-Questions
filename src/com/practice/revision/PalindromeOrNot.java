package com.practice.revision;
import java.util.*;
public class PalindromeOrNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the string to check palindrome or not");
        String str = sc.nextLine();
        if (isPalindrome(str))
        {
            System.out.println(str+" "+"is a palindrome");
        }
        else
        {
            System.out.println(str+" "+"is not a palindrome");
        }
    }

    public static boolean isPalindrome(String str)
    {
        int n = str.length();
        for(int i = 0; i < n / 2; i++)
        {
           if(str.charAt(i)!=str.charAt(n-1-i))
           {
               return false;
           }
        }
        return true;
    }
}