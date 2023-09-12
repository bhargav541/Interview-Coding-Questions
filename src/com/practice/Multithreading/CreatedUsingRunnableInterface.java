package com.practice.Multithreading;
import java.lang.*;
public class CreatedUsingRunnableInterface implements Runnable{

    @Override
    public void run()
    {
        System.out.println("\nThis is a Thread created using runnable interface");
    }

    public static void main(String[] args)
    {
        CreatedUsingRunnableInterface test = new CreatedUsingRunnableInterface();
        Thread th = new Thread(test);
        th.start();
    }
}