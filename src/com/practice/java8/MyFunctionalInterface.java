package com.practice.java8;
import java.util.*;
@FunctionalInterface
public interface MyFunctionalInterface {
    public void run();
    default void myDefaultMethod()
    {
        System.out.println("It is a default method");
    }
}