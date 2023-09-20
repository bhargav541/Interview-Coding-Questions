package com.practice.Java;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int findLongestSubstring(String s) {
        int n = s.length();
        int left = 0, right = 0, maxLen = 0;
        Set<Character> set = new HashSet<>();

        while (right < n) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
                maxLen = Math.max(maxLen, right - left);
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String s = "bhargav";
        int longestSubstring = findLongestSubstring(s);
        System.out.println("\nThe length of the longest substring without repeating characters is: " + longestSubstring);
    }
}