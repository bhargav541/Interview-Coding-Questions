package com.practice.Multithreading;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CheckThreadSafe extends Thread {

    static Map<Integer, String> map = new ConcurrentHashMap<>();

    public void run() {
        map.put(3, "UST");
    }

    public static void main(String[] args) throws InterruptedException {

        map.put(1, "Bhargav");
        map.put(2, "Amit Panda");

        CheckThreadSafe c = new CheckThreadSafe();
        c.start();

        for (Integer key : map.keySet()) {
            System.out.println(key);
        }

    }
}
