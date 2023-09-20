package com.practice.Revision;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Manjula", "Manju", "Manjula", "Manju");
        Set<String> dupNames = new HashSet<>();
        names.stream().filter(duplicates -> !dupNames.add(duplicates)).forEach(System.out::println);

        String s = "Manjunatha";
        Map<Character, Long> streamRes = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        streamRes.forEach((character, count) -> {
            System.out.println(character + ":" + count);
        });
    }
}