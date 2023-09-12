package com.practice.java8;
import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicateElementsUsingStreamAPI {
    public static void main(String[] args) {

        //finding the duplicate names from the names list
        List<String> names = Arrays.asList("Amit", "Kumar","Kumar", "Panda", "Panda", "Amit", "Manju");
        Set<String> dupNames = new HashSet<>();
        names.stream().filter(name -> !dupNames.add(name)).forEach(System.out::println);
        System.out.println();

        //finding the duplicate integers in the list
        List<Integer> integers = Arrays.asList(1, 3, 3, 4, 5, 6, 3, 1);
        Set<Integer> intvalues = new HashSet<>();
        integers.stream().filter(intval -> !intvalues.add(intval)).forEach(System.out::println);
        System.out.println();

        //finding the duplicates in the given string and mapping duplicate character and its count
        String input = "I LOVE PROGRAMMING";
        Map<Character, Long> dupCharAndCount = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        dupCharAndCount.forEach((character, count) -> {
            if (count>1) {
                System.out.println(character + ":" + count);
            }
        }
        );
    }
}