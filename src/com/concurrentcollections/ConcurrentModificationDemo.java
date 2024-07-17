package com.concurrentcollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentModificationDemo
{
    public static void main(String[] args) throws InterruptedException
    {
        MyThread thread1 = new MyThread();
        MyThread .list.add("A");
        MyThread .list.add("B");
        MyThread .list.add("C");
        Iterator iterator=MyThread.list.iterator();
        thread1.start();
        while (iterator.hasNext())
        {

            System.out.println("Main Thread is ieterating list and current object is "+iterator.next());
            Thread.sleep(2000);
        }
    }
}
class MyThread extends Thread
{
    public static ArrayList list = new ArrayList();
    public void run()
    {
        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Child Thread Trying to update list");
        list.add("D");

    }
}
