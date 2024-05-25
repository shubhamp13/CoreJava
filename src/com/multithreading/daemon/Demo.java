package com.multithreading.daemon;

public class Demo
{
    public static void main(String[] args)
    {
        System.out.println(Thread.currentThread().isDaemon());
        Thread t1 = new Thread();
        System.out.println(t1.isDaemon());
        t1.setDaemon(true);
        System.out.println(t1.isDaemon());
    }

}
