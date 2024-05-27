package com.multithreading.enhancements.concurrentLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class MyThread3 extends Thread
{
    static ReentrantLock l=new ReentrantLock();
    public MyThread3(String name)
    {
        super(name);
    }
    public void run()
    {
        do
        {
            try
            {
                if(l.tryLock(5000,TimeUnit.MILLISECONDS))
                {
                    System.out.println("Thread Which Is Got Lock "+Thread.currentThread().getName());
                    Thread.sleep(30000);
                    System.out.println(Thread.currentThread().getName()+" Is Releasing The Lock");
                    l.unlock();
                    break;
                }
                else
                {
                    System.out.println("Thread Which is Trying To Get Lock "+Thread.currentThread().getName());
                }
            }
            catch (InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
        }while (true);
    }
}
public class ReentrantDemo2
{
    public static void main(String[] args)
    {
        MyThread3 t1=new MyThread3("Virat");
        MyThread3 t2=new MyThread3("Rohit");
        t1.start();
        t2.start();
    }
}
