package com.practice.java8;


@FunctionalInterface
public interface MyFunctionalInterface {
    public void run();

    default void myDefaultMethod() {
        System.out.println("It is a default method");
    }
}