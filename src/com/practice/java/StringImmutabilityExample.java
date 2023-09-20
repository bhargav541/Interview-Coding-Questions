package com.practice.java;

public class StringImmutabilityExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = str1; // Both str1 and str2 refer to the same string object in the String Pool
        System.out.println("Initial str1: " + str1); // Output: Initial str1: Hello
        System.out.println("Initial str2: " + str2); // Output: Initial str2: Hello
        str1 = str1.concat(" World"); // Concatenating " World" to str1 System.out.println("Modified str1: " + str1); // Output: Modified str1: Hello World
        System.out.println("Unchanged str2: " + str2); // Output: Unchanged str2: Hello
    }
}