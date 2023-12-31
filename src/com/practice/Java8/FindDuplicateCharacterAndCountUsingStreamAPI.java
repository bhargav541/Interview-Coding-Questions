package com.practice.Java8;

import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateCharacterAndCountUsingStreamAPI {
    public static void main(String[] args) {
        String s = "SCHNEIDER ELECTRIC";
        Map<Character, Long> streamRes = s.chars()
                                          .mapToObj(c -> (char) c)
                                          .collect(Collectors.groupingBy
                                          (c -> c, Collectors.counting())
                                          );

        streamRes.forEach(((character, count) -> {
            if (count > 1) {
                System.out.println(character + ":" + count);
            }
        }));
    }
}