package com.practice.Java;

import java.util.HashSet;
import java.util.Set;

public class FindLargestSubStringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        int leftCounter = 0;           // Initialize leftCounter to 0; it represents the start of the current substring.
        int rightCounter = 0;          // Initialize rightCounter to 0; it helps traverse the string to find unique characters.
        int maxLen = 0;                // Initialize maxLen to 0; it will store the length of the longest substring without repeating characters.
        String s = "abcabcabc";
        int n = s.length();            // Calculate the length of the input string.
        Set<Character> set = new HashSet<>();   // Use a set to store unique characters; it prevents duplicates.

        while (rightCounter < n) {           // Iterate through the string until we reach the end.
            if (!set.contains(s.charAt(rightCounter))) {
                // If the character at rightCounter is not in the set (i.e., it's unique),
                // we add it to the set and extend the current substring.
                set.add(s.charAt(rightCounter));
                rightCounter++;
                maxLen = Math.max(maxLen, rightCounter - leftCounter);
                // Calculate the length of the current substring and update maxLen if needed.
            } else {
                // If the character already exists in the set (i.e., it's a repeating character),
                // remove the character at leftCounter from the set, and increment leftCounter.
                set.remove(s.charAt(leftCounter));
                leftCounter++;
            }
        }
        System.out.println("The length of the largest substring without repeating characters in the given string is: " + maxLen);
    }
}