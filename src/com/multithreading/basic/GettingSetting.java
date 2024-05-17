package com.multithreading.basic;

public class GettingSetting
{
    public static void main(String[] args)
    {
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Shubham");
        System.out.println(Thread.currentThread().getName());
        MyRunnable r=new MyRunnable();
        Thread t=new Thread(r);
        t.setName("shrikant");
        Thread t2=new Thread(r);
        t2.setName("sejal");
        System.out.println(t.getName());
        System.out.println(t2.getName());
    }
}
