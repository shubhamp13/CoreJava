package com.multithreading.executionprevent.join;

public class MyRunnableDemo
{
    public static void main(String[] args)
    {
        MyRunnable.mainThread=Thread.currentThread();
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        for(int i=0; i<10; i++)
        {
            System.out.println("Main Thread:"+i);
        }
    }
}
