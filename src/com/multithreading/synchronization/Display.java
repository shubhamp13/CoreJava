package com.multithreading.synchronization;

public class Display
{
    public synchronized void display(String msg)
    {
        for(int i=0;i<10;i++)
        {
            System.out.print("Good Morning: ");
            try
            {
                Thread.sleep(2000);
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println(msg);
        }
    }
}
