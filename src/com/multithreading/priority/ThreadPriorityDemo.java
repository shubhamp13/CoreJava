package com.multithreading.priority;

public class ThreadPriorityDemo
{
    public static void main(String[] args)
    {
        MyThread myThread = new MyThread();
        myThread.setPriority(10);
        myThread.start();
        for(int i=0;i<5;i++)
        {
            System.out.println("Main Thread");
        }
    }
}
