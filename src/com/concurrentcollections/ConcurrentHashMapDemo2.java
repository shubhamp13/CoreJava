package com.concurrentcollections;


import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo2
{
    public static void main(String[] args)
    {
        for(int i=65;i<=90;i++)
        {
            MyThread3.map.put((char)i,i);
        }
        System.out.println(MyThread3.map);
        Set set = MyThread3.map.entrySet();
        Iterator iterator = set.iterator();
        MyThread3 t=new MyThread3();
        t.start();
        while (iterator.hasNext())
        {
            System.out.println("Main Thread Iterating Map Object ");
            Map.Entry e=(Map.Entry)(iterator.next());
            System.out.println(e.getKey()+":"+e.getValue());
            try
            {
                Thread.sleep(2000);
            }
            catch (InterruptedException e1)
            {
                e1.printStackTrace();
            }
        }
        System.out.println(MyThread3.map);
    }
}
class MyThread3 extends Thread
{
    static ConcurrentHashMap map=new ConcurrentHashMap();
    public void run()
    {
        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
        int j=97;
        for(int i=97;i<=122;i++)
        {
            System.out.println("Child Thread Updating Map Object");
            map.put((char)i,i);
        }
    }
}
