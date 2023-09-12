package com.practice.revision;
import java.util.*;
public class FindDuplicateCharAndCount
{
    public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string");
            String s = sc.nextLine();

            HashMap<Character, Integer> map = new HashMap<>();
            for (Character c:s.toCharArray())
            {
                int duplicateCount = 1;
                if (map.containsKey(c))
                {
                    duplicateCount = map.get(c);
                    duplicateCount++;
                    map.put(c,duplicateCount);
                }
                    map.put(c,duplicateCount);
            }
        System.out.println(map);
    }
}