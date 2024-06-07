package com.multithreading.threadlocal;

public class ParentThread3 extends Thread
{
    public static InheritableThreadLocal t=new InheritableThreadLocal<>()
    {
        public Object childValue(Object p)
        {
            return "INDIA";
        }
    };

    @Override
    public void run()
    {
        t.set("Maharashtra");
        System.out.println("Parent Thread Variable Value:-------"+t.get());
        ChildThread3 thread3 = new ChildThread3();
        thread3.start();

    }
}
class ChildThread3 extends Thread
{
    @Override
    public void run() {
        System.out.println("Child Thread Variable Value:---------"+ParentThread3.t.get());
    }
}

class ThreadLocalDemo6
{
    public static void main(String[] args)
    {
        ParentThread3 t=new ParentThread3();
        t.start();

    }
}
