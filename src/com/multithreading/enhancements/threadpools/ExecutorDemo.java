package com.multithreading.enhancements.threadpools;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyRunnable implements Runnable
{
    String name;
    public MyRunnable(String name)
    {
        this.name = name;
    }
    public void run()
    {
        System.out.println(name+"   Job is started By "+Thread.currentThread().getName());
        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e){}
        System.out.println(name+"   Job is finished By "+Thread.currentThread().getName());
    }
}
public class ExecutorDemo
{
    public static void main(String[] args)
    {
        MyRunnable [] myRunnables = {new MyRunnable("shubham"),
                new MyRunnable("sejal"),
                new MyRunnable("Shrikant"),
                new MyRunnable("Ajay"),
                new MyRunnable("Sanket"),
                new MyRunnable("Himanshu")};

        ExecutorService executor= Executors.newFixedThreadPool(3);
        for(MyRunnable r:myRunnables)
        {
            executor.submit(r);
        }
        executor.shutdown();
    }
}
