package com.practice.Java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class DemoStreamApi {

    public static void main(String[] args) {

        //stream can be created in 2 ways

        //1. using of()
        //2. using stream()

        //1. syntax using of()
        Stream<Integer> s = Stream.of(1, 2, 3, 4, 5);
        s.filter(i -> i > 2).forEach(System.out::println);

        //2. syntax using stream()
        List<String> names = Arrays.asList("Bhargav", "Chaitanya", "Manjula", "Manjunatha", "Amit");
        Stream<String> s1 = names.stream();
        s1.filter(a -> a.startsWith("A")).forEach(System.out::println);

        //examples of stream operations
        //1. To find the employees salaries greater than/ equal to 500
        List<Integer> EmployeeSalaries = Arrays.asList(100, 500, 800, 900, 50);
        Stream<Integer> s2 = EmployeeSalaries.stream();
        s2.filter(a -> a >= 500).forEach(System.out::println);

        //2. To find the employees names and salaries greater than/ equal to 500
        List<Integer> EmployeeSalariesAndNames = Arrays.asList(100, 500, 800, 900, 50);
        Stream<Integer> s4 = EmployeeSalariesAndNames.stream();
        s4.filter(a -> a >= 500).forEach(System.out::println);

        //3. Convert the lowercase names to uppercase
        List<String> name = Arrays.asList("bhargav", "chaitanya", "manjula", "manjunatha", "amit");
        Stream<String> s3 = name.stream();
        s3.map(a -> a.toUpperCase()).forEach(System.out::println);
        //s3.map(String::toUpperCase).forEach(System.out::println); simplest version of above line of code (using method reference)

        //example to use the reduce method
        List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = listOfNumbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);

        //example for map function
        List<Integer> squares = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> printingSquares = squares.stream().map(x -> x * x).toList();
        System.out.println(printingSquares);

        //example for flatmap function
        List<List<String>> checkingFlatMap = Arrays.asList(
                Arrays.asList("Cinema", "Arjun Reddy"),
                Arrays.asList("Sports", "Sachin"),
                Arrays.asList("Coding", "Manja"));
        List<String> flattenedList = checkingFlatMap.stream().flatMap(Collection::stream).toList();
        System.out.println(flattenedList);
    }
}