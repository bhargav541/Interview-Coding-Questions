package com.practice.Multithreading;

import java.lang.*;

public class CreatedUsingThreadClass extends Thread {
    @Override
    public void run() {
        System.out.println("Thread Started!!!!!");
    }

    public static void main(String[] args) {
        CreatedUsingThreadClass ct = new CreatedUsingThreadClass();
        ct.start();
    }
}