package com.multithreading.priority;

public class NameAndPriority
{
    public static void main(String[] args)
    {
        System.out.println("Thread Min Priority Is "+Thread.MIN_PRIORITY);
        System.out.println("Thread Norm Priority Is "+Thread.NORM_PRIORITY);
        System.out.println("Thread Max Priority Is "+Thread.MAX_PRIORITY);
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Shubham Puri");
        System.out.println("Thread Priority:"+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        System.out.println("Thread Priority:"+Thread.currentThread().getPriority());
    }
}
