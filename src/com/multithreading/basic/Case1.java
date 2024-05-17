package com.multithreading.basic;
public class Case1
{
    public static void main(String[] args)
    {
        MyThread t1=new MyThread();
        t1.start();

        for (int i=0;i<10;i++)
        {
            System.out.println("Main Thread");
        }
        System.out.println("Case 1:");
        System.out.println("Thread Scheduler:");
        System.out.println("\t1.It is the part of JVM");
        System.out.println("\t2.If multiple threads are waiting to chance for execution then thread\n" +
                "\t scheduler is responsible for in which orders thread will be executed\n");
        System.out.println("\t3.Inside Thread scheduler we can not confirm about which scheduling\n" +
                "\t algorithm is implemented and it is using it changes from system to system and from\n" +
                "\t execution to execution");
        System.out.println("\t4.Hence we can not predict order of execution in multithreading example");

    }
}
