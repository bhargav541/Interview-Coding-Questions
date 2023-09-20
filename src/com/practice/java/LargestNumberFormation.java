package com.practice.java;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumberFormation {
    public static String largestNumber(int[] nums) {
        // Convert integer array to string array
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        // Sort the strings using custom comparator
        Arrays.sort(strNums, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1); // Reverse order for largest number
            }
        });

        // If the largest number is 0, return "0"
        if (strNums[0].equals("0")) {
            return "0";
        }

        // Concatenate the sorted strings to form the largest number
        StringBuilder result = new StringBuilder();
        for (String str : strNums) {
            result.append(str);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        int[] nums = {3, 30, 34, 5, 9};
        String largestFormedNumber = largestNumber(nums);
        System.out.println("Largest formed number: " + largestFormedNumber);
    }
}
