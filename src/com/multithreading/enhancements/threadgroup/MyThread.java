package com.multithreading.enhancements.threadgroup;

public class MyThread extends Thread
{
    public MyThread(ThreadGroup group, String name)
    {
        super(group, name);
    }

    @Override
    public void run() {
        System.out.println("Child Thread Started");
        try
        {
            Thread.sleep(10000);
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
    }
}
