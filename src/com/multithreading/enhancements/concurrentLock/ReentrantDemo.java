package com.multithreading.enhancements.concurrentLock;

import java.util.concurrent.locks.ReentrantLock;

class MyThread2 extends Thread
{
    static ReentrantLock l=new ReentrantLock();
    public MyThread2(String name)
    {
        super(name);
    }
    public void run()
    {
        if(l.tryLock())
        {
            System.out.println("Thread Which Got Lock:--"+Thread.currentThread().getName());
            try
            {
                Thread.sleep(2000);
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
            l.unlock();
        }
        else
        {
            System.out.println("Thread Which Does Not Get Lock "+Thread.currentThread().getName());
        }
    }
}
public class ReentrantDemo
{
    public static void main(String[] args)
    {
        MyThread2 t1=new MyThread2("Virat");
        MyThread2 t2=new MyThread2("Rohit");
        t1.start();
        t2.start();
    }
}

