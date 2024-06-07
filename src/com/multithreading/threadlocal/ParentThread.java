package com.multithreading.threadlocal;

public class ParentThread extends Thread
{
    public static ThreadLocal t1=new ThreadLocal();

    @Override
    public void run()
    {
        t1.set("shubham");
        System.out.println("Parent Thread Value:------"+t1.get());
        ChildThread child=new ChildThread();
        child.start();
    }
}
class ChildThread extends Thread
{
    public void run()
    {
        System.out.println("Child Thread Value:-----"+ParentThread.t1.get());
    }
}
class ThreadLocalDemo4
{
    public static void main(String[] args) {
        ParentThread t1=new ParentThread();
        t1.start();
    }
}
