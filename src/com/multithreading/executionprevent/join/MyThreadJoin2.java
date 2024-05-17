package com.multithreading.executionprevent.join;

public class MyThreadJoin2 extends Thread
{
    static Thread mt;
    public void run()
    {
        try
        {
            mt.join(10000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        for (int i=0; i<10; i++)
        {
            System.out.println("Child Thread");
        }
    }
}
