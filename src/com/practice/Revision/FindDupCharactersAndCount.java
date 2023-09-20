package com.practice.Revision;

import java.util.*;

public class FindDupCharactersAndCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : s.toCharArray()) {
            int n = 1;
            if (map.containsKey(c)) {
                n = map.get(c);
                n++;
                map.put(c, n);
            } else {
                map.put(c, n);
            }
        }
        System.out.println(map);
    }
}