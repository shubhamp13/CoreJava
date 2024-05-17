package com.multithreading.executionprevent.join;

public class ThreadJoinDemo
{
    public static void main(String[] args) throws InterruptedException
    {
        MyThreadJoin myThreadJoin = new MyThreadJoin();
        myThreadJoin.start();
        myThreadJoin.join();
//        myThreadJoin.join(5000);
        for(int i=0;i<5;i++)
        {
            System.out.println("Main Thread");
        }
    }
}
