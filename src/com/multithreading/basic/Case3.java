package com.multithreading.basic;

class MyThread3 extends Thread
{
    public  void  run()
    {
        System.out.println("no -argument method");
    }
    public  void  run(int i)
    {
        System.out.println("int argument method");
    }
}
public class Case3
{
    public static void main(String[] args)
    {
        MyThread3 t=new MyThread3();
        t.start();
        System.out.println("Case 3: ");
        System.out.println("Overloading of run method");
        System.out.println("\t1.We can override run method\n");
        System.out.println("\t2Thread class start() method always call run() method without argument\n");
        System.out.println("\t3.to call overloaded run method we have to call that method explicitly");
    }
}
