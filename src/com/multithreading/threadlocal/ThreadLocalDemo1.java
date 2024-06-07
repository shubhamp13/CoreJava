package com.multithreading.threadlocal;

public class ThreadLocalDemo1
{
    public static void main(String[] args)
    {
        ThreadLocal t1=new ThreadLocal();
        System.out.println(t1.get());
        t1.set("shubham");
        System.out.println(t1.get());
        t1.remove();
        System.out.println(t1.get());
    }
}
