package com.multithreading.synchronizedblock;
class MyThread extends Thread
{
    Greet greet;
    String message;
    public  MyThread(Greet greet,String message)
    {
        this.greet=greet;
        this.message=message;
    }

    @Override
    public void run()
    {
        greet.greetMessage(message);
    }
}
public class SyncBlockDemo
{
    public static void main(String[] args)
    {
        Greet greet=new Greet();
        MyThread myThread=new MyThread(greet,"Good Morning");
        MyThread myThread1=new MyThread(greet,"Good Afternoon");
        myThread1.start();
        myThread.start();
    }
}
