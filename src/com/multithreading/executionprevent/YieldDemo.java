package com.multithreading.executionprevent;

public class YieldDemo
{
    public static void main(String[] args)
    {
        MyThreadYield myThreadYield = new MyThreadYield();
        Thread t1 = new Thread(myThreadYield);
        t1.start();
        for(int i=0;i<5;i++)
        {
            System.out.println("Main Thread");
        }
    }
}
