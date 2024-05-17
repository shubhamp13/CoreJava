package com.multithreading.executionprevent.yield;
class Thread2 extends Thread
{
    public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println("child thread");

        }
    }
}


public class YieldDemo2
{
    public static void main(String[] args)
    {
        Thread2 t1 = new Thread2();
        t1.start();
        for(int i = 0; i < 10; i++)
        {
            System.out.println("main thread");
            Thread.yield();
        }
    }
}
