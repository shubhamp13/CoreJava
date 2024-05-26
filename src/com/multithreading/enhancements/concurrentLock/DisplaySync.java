package com.multithreading.enhancements.concurrentLock;


import java.util.concurrent.locks.ReentrantLock;

public class DisplaySync
{
    ReentrantLock reentrantLock=new ReentrantLock();
    public  void wish(String message)
    {

        reentrantLock.lock();
        for(int i=0;i<10;i++)
        {
            System.out.print("Good Morning");
            try
            {
                Thread.sleep(2000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println(" "+message);

        }
        reentrantLock.unlock();
    }
}
