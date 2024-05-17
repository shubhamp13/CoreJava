package com.multithreading.basic;

public class MyRunnable implements Runnable
{
    @Override
    public void run()
    {
        System.out.printf("child thread");
    }
}
class MyRunnableDemo
{
    public static void main(String[] args)
    {
        MyRunnable r=new MyRunnable();
        Thread t=new Thread(r);
        t.start();
        System.out.printf("Main Thread   ");
    }
}
