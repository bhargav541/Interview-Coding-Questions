package com.practice.java;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1};
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j = i+1; j<n; j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("\nSorted array is"+" "+ Arrays.toString(arr));
    }
}