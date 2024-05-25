package com.multithreading.deadlock;

public class Second
{
    public  synchronized  void d2(First first)
    {
        System.out.println("Inside Second Class D2 Method");
        try
        {
            Thread.sleep(6000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Calling Display Method Of First Class");
        first.display();
    }
    public  synchronized void display()
    {
        System.out.println("This Is Second class Display Method");
    }
}
