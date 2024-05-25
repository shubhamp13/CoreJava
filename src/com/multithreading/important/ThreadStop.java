package com.multithreading.important;

import com.multithreading.daemon.MyThread;

public class ThreadStop
{
    public static void main(String[] args)
    {
        MyThread myThread=new MyThread();
        myThread.start();
        System.out.println("End Of Main Thread");
        myThread.stop();
    }
}
