package com.multithreading.basic;

public class ThreadClass extends Thread
{

    public static void main(String[] args)
    {
        System.out.println("1.Thread class Constructors:");
        System.out.println("2.public Thread(){}\n");
        System.out.println("3.public Thread(Runnable r){}\n");
        System.out.println("4.public Thread(String name){}\n");
        System.out.println("5.public Thread(Runnable r,String name){}\n");
        System.out.println("6.public Thread(ThreadGroup g,String name){}\n");
        System.out.println("7.public Thread(ThreadGroup g,Runnable r,String name){}\n");
        System.out.println("8.public Thread(threadGroup g,Runnable r,String name,long stackSize){}\n");
    }
}
