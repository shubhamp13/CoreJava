package com.multithreading.executionprevent.join;

public class MyRunnable implements Runnable
{
    public  static  Thread mainThread = null;
    public void run()
    {
        try
        {
            mainThread.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        for(int i=0;i<10;i++)
        {
            try
            {
                System.out.println("Child Thread :"+i);
                Thread.sleep(2000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
