package com.practice.Collections;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastList
{
    public static void main(String[] args)
    {
            List<String> list = new CopyOnWriteArrayList<>();
            list.add("a");
            list.add("B");
            list.add("C");

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext())
        {
            String elements = iterator.next();
            System.out.println(elements);
        }
//        for (String elements : list) {
//            System.out.println(elements);
//        }
    }
}