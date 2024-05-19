package com.multithreading.interrupt;

public class MyThread extends Thread
{
    @Override
    public void run()
    {
        for(int i=0;i<5000;i++)
        {
            System.out.println("Child Thread:-"+i);
        }
        try
        {
            Thread.sleep(1000);
            System.out.println("Child Thread After Sleep");
        }
        catch (InterruptedException e )
        {
            System.out.println("Thread Got Interrupted");
        }
    }
}
