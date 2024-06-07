package com.multithreading.enhancements.threadpools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyRunnable2 implements Runnable
{
    String name;
    public MyRunnable2(String name)
    {
        this.name = name;
    }

    @Override
    public void run()
    {
        System.out.println(name+" Is Starting its execution by "+Thread.currentThread().getName());
        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println(name+" Is Finishing its execution by "+Thread.currentThread().getName());
    }
}
public class ExecutorDemo2
{
    public static void main(String[] args)
    {
        MyRunnable2 []myRunnable2s={new MyRunnable2("Shubham"),
        new MyRunnable2("Sejal"),
        new MyRunnable2("Shrikant"),
        new MyRunnable2("Priyanka"),
        new MyRunnable2("Ajay"),
        new MyRunnable2("Vaishnavi")};
        ExecutorService service= Executors.newFixedThreadPool(3);
        for(MyRunnable2 myRunnable2:myRunnable2s)
        {
            service.submit(myRunnable2);
        }
        service.shutdown();
    }
}
