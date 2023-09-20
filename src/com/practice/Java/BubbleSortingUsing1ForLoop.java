package com.practice.Java;

public class BubbleSortingUsing1ForLoop {
    public static void main(String[] args) {
        boolean valuesSwitched = false;
        int[] list = {1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0};
        int len = list.length;

        for (int i = 1; i <= len; i++) {
            if (i == len) {
                if (!valuesSwitched) {
                    break;
                }

                valuesSwitched = false;
                i = 1;
            }
            if (list[i - 1] > list[i]) {
                int temp = list[i - 1];
                list[i - 1] = list[i];
                list[i] = temp;
                valuesSwitched = true;
            }
        }
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}