package com.multithreading.daemon;

public class DeamonDemo
{
    public static void main(String[] args)
    {
        MyThread t = new MyThread();
        t.setDaemon(true);
        t.start();
        System.out.println("End Of Main Thread");
    }
}
