package com.multithreading.executionprevent.sleep;

public class MyThread extends Thread
{
    public void run()
    {
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
    }
}
