package com.practice.java8;
import java.util.*;
import java.util.function.BiConsumer;

public class LambdaExpression {
    public static void main(String[] args) {

        BiConsumer<Integer, Integer> biConsumer = (a,b) -> System.out.println(a+b);
        biConsumer.accept(10,10);

        List<String> names = Arrays.asList("Bhargav","Chaitanya","Manjunatha", "Manjula");
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
        for (String name: names) {
            System.out.print(name+" ");
        }
    }
}