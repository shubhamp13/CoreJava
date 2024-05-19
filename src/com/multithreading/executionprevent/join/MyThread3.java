package com.multithreading.executionprevent.join;

public class MyThread3 implements Runnable
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            try
            {
                System.out.println("Child Thread");
                Thread.sleep(2000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
