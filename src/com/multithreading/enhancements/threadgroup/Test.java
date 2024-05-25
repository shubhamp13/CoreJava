package com.multithreading.enhancements.threadgroup;

public class Test
{
    public static void main(String[] args)
    {
        System.out.println("Main Thread Group Name:-"+Thread.currentThread().getThreadGroup().getName());
        System.out.println("Parent Group Of MainThreadGroup is: "+Thread.currentThread().getThreadGroup().getParent().getName());
    }
}
