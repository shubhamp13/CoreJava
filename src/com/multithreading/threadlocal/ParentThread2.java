package com.multithreading.threadlocal;

public class ParentThread2 extends  Thread {
    public static InheritableThreadLocal local = new InheritableThreadLocal();

    public void run() {
        local.set("Shubham Puri");
        System.out.println("Parent Thread Value:-----" + local.get());
         ChildThread2 thread2=new ChildThread2();
         thread2.start();
    }
}

class  ChildThread2 extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Child Thread Varibale Value----------"+ParentThread2.local.get());

    }
}
class ThreadLocalDemo5
{
    public static void main(String[] args)
    {
        ParentThread2 thread2=new ParentThread2();
        thread2.start();
    }
}

