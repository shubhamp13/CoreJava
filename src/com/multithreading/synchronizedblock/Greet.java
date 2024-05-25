package com.multithreading.synchronizedblock;

public class Greet
{
    public void greetMessage(String message)
    {
//        System.out.println("-------------------Outside Synchronized block----------");

        synchronized (this)
        {
            for (int i=0; i<10; i++)
            {
                System.out.print("Hello Everyone....");
                try
                {
                    Thread.sleep(2000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(message);
            }
        }
//        System.out.println("-------------------Outside Synchronized block----------");
    }
}
