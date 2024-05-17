package com.multithreading.priority;
public class ThreadPriority
{
    public static void main(String[] args)
    {
        System.out.println("Main Thread Priority:"+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(9);
        MyThread myThread = new MyThread();
        System.out.println(myThread.getPriority());

    }
}
