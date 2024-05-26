package com.multithreading.enhancements.concurrentLock;

import com.multithreading.synchronization.Display;

class MyThread extends Thread
{
    DisplaySync d;
    String name;
    public MyThread(DisplaySync d,String name)
    {
        this.d=d;
        this.name=name;
    }
    public void run()
    {
        d.wish(name);
    }
}
public class DemoSync
{
    public static void main(String[] args)
    {
        DisplaySync d = new DisplaySync();
        MyThread t1=new MyThread(d,"Virat");
        MyThread t2=new MyThread(d,"Rohit");
        t1.start();
        t2.start();
    }
}
