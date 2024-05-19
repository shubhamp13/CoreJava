package com.multithreading.executionprevent.join;

public class ThreadJoinTest
{
    public static void main(String[] args) throws InterruptedException
    {
        MyThread3 myThread = new MyThread3();
        Thread t1 = new Thread(myThread);
        t1.start();
        t1.join(10000);
        for(int i=0;i<10;i++)
        {
            System.out.println("Main Thread");
        }
    }
}
