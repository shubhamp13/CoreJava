package com.concurrentcollections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo2
{
    public static void main(String[] args)
    {
        MyThread4.list.add(1);
        MyThread4.list.add(2);
        MyThread4.list.add(3);
        MyThread4.list.add(4);
        Iterator iterator=MyThread4.list.iterator();
        MyThread4 myThread4=new MyThread4();
        myThread4.start();
        while (iterator.hasNext())
        {
            System.out.println("Main Thread is iterating CopyOnWriteArrayListObject "+iterator.next());
            try
            {
                Thread.sleep(2000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        System.out.println(MyThread4.list);
    }
}
class MyThread4 extends Thread
{
    public static CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>();
    public void run()
    {
        try
        {
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Child Thread Updating List");
        list.add(18);
    }
}
