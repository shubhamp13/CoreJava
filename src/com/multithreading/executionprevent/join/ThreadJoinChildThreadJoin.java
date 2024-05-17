package com.multithreading.executionprevent.join;

public class ThreadJoinChildThreadJoin
{
    public static void main(String[] args) throws InterruptedException
    {
        MyThreadJoin2.mt=Thread.currentThread();
        MyThreadJoin2 t=new MyThreadJoin2();
        t.start();
        for(int i=0;i<10;i++)
        {
            System.out.println("Main Thread");
            Thread.sleep(2000);
        }
    }
}
