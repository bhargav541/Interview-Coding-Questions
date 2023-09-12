package com.practice.revision;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 8, 1, 4, 2, 3, 0, 7, 6};

        int n = arr.length;
        System.out.println("\nThe original array is" +" "+ Arrays.toString(arr));
        for (int i = 0; i <= n - 1; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("\nThe Sorted array is\n");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}