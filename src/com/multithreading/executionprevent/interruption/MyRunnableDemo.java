package com.multithreading.executionprevent.interruption;

public class MyRunnableDemo
{
    public static void main(String[] args)
    {
        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable);
        t1.start();
        t1.interrupt();
        for(int i=0;i<10;i++)
        {
            System.out.println("Main Thread "+i);
        }
    }
}
