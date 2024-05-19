package com.multithreading.interrupt;

public class InteruuptDemo
{
    public static void main(String[] args)
    {
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.interrupt();
        System.out.println("Main Thread End");
    }
}
