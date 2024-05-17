package com.multithreading.executionprevent.join;

public class JoinLoopHoles
{
    public static void main(String[] args) throws InterruptedException
    {
        Thread.currentThread().join();
        System.out.println("Hello");
    }
}
