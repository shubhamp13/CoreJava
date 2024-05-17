package com.multithreading.executionprevent.join;

public class MyThreadJoin extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Child Thread");
            try
            {
                Thread.sleep(2000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
