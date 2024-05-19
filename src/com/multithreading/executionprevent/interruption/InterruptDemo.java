package com.multithreading.executionprevent.interruption;

public class InterruptDemo
{
    public static void main(String[] args)
    {
        MyThread thread = new MyThread();
        thread.setPriority(10);
        thread.start();
        thread.interrupt();
        System.out.println("End Of Main");
    }
}
