package com.multithreading.synchronization;

class MyThread1 extends Thread
{
    Display1 display;
    public MyThread1(Display1 display)
    {
        this.display = display;
    }
    public void run()
    {
        display.displayN();
    }
}
class MyThread2 extends Thread
{
    Display1 display;
    public MyThread2(Display1 display)
    {
        this.display = display;
    }
    public void run()
    {
        display.displayC();
    }
}
public class SyncDemo2
{
    public static void main(String[] args)
    {
        Display1 display = new Display1();
        Display1 display1=new Display1();
        MyThread1 myThread1 = new MyThread1(display);
        MyThread2 myThread2 = new MyThread2(display);
        myThread1.start();
        myThread2.start();
    }
}
