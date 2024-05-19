package com.multithreading.executionprevent.sleep;

public class ThreadSleepDemo
{
    public static void main(String[] args)
    {
        try
        {
            for(int i=0;i<5;i++)
            {
                System.out.println("Slide: "+i);
                Thread.sleep(5000);
            }

        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
