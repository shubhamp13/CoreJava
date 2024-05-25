package com.multithreading.deadlock;

public class First
{
    public synchronized void d1(Second second)
    {
        System.out.println("Inside First Class d1 Meethos");
        try
        {
            Thread.sleep(6000);
        }
        catch (InterruptedException e){}
        System.out.println("Calling Display method of Second class");
        second.display();
    }
    public synchronized void display()
    {
        System.out.println("First Class Display Method");
    }
}
