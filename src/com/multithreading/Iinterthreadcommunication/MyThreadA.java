package com.multithreading.Iinterthreadcommunication;

class MyThreadB extends Thread
{
    int sum=0;
    @Override
    public void run()
    {

        synchronized (this)
        {
            System.out.println("Thread B Started Calculation");
            for(int i=1;i<=100;i++)
            {
                sum+=i;
            }
            this.notify();
            System.out.println("Thread B notify to thread A");
        }
    }
}

public class MyThreadA
{
    public static void main(String[] args) throws InterruptedException
    {
        MyThreadB thread = new MyThreadB();
        thread.start();
        synchronized (thread)
        {
            System.out.println("Main Thread Calling Wait Method");
            thread.wait();
            System.out.println("Main Thread Got Notified");
            System.out.println(thread.sum);
        }

    }
}
