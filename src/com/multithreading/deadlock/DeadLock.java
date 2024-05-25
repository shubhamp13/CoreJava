package com.multithreading.deadlock;

public class DeadLock extends Thread
{
    First first = new First();
    Second second = new Second();
    public  void m1()
    {
        this.start();
        first.d1(second);
    }
    public  void run()
    {
        second.d2(first);
    }

    public static void main(String[] args)
    {
        DeadLock deadLock = new DeadLock();
        deadLock.m1();
    }

}
