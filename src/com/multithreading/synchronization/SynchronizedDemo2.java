package com.multithreading.synchronization;

public class SynchronizedDemo2
{
    public static void main(String[] args)
    {
        Display display = new Display();
        Display display2 = new Display();
        MyThread myThread=new MyThread(display,"Dhoni");
        MyThread myThread2=new MyThread(display2,"Kohli");
        myThread.start();
        myThread2.start();
    }
}
