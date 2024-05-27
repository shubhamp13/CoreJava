package com.multithreading.enhancements.threadpools;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable
{
    int num;
    public MyCallable(int num)
    {
        this.num = num;
    }
    public Object call()throws Exception
    {
        System.out.println(Thread.currentThread().getName() + " Is Responsible to find sum of first "+num+" Natural Numbers");
        int sum=0;
        for(int i=0;i<=num;i++)
        {
            sum+=i;
        }
        return sum;

    }
}
public class ExecutorCallableDemo
{
    public static void main(String[] args) throws Exception
    {
        MyCallable [] myCallables={new MyCallable(10),
        new MyCallable(20),
        new MyCallable(30),
        new MyCallable(40),
        new MyCallable(50),
        new MyCallable(60)};

        ExecutorService service= Executors.newFixedThreadPool(3);
        for(MyCallable myCallable:myCallables)
        {
            Future f =service.submit(myCallable);
            System.out.println(f.get());
        }
        service.shutdown();

    }
}
