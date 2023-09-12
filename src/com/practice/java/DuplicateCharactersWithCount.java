package com.practice.java;
import java.util.*;
public class DuplicateCharactersWithCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the string whose duplicate to be found");
        String str = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character c :str.toCharArray())
        {
            int n = 1;
            if(map.containsKey(c))
            {
                n = map.get(c);
                n++;
                map.put(c,n);
            }
            else
            {
                map.put(c,n);
            }
        }
        System.out.println(map);
    }
}