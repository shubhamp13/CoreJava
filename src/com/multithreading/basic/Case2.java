package com.multithreading.basic;

class MyThread2 extends  Thread
{
    public  void run()
    {
       for(int i=0;i<10;i++)
       {
           System.out.println("child thread method");
       }
    }
}
public class Case2
{
    public static void main(String[] args)
    {
        MyThread2 t=new MyThread2();
        t.run();
        for(int i=0;i<10;i++)
        {
            System.out.println("Main thread method");
        }
        System.out.println("Case 2:");
        System.out.println("Difference Between run() and start() method");
        System.out.println("\t1.If we are calling start method then internally start method is responsible\n" +
                "\t to perform certain activities such as:");
        System.out.println("\t\t1.To create new thread amd  register disk scheduler");
        System.out.println("\t\t2.to perform some mandatory activities");
        System.out.println("\t\t3.To invoke run method\n");

        System.out.println("\t2.If we are calling run method directly instead of start method then:");
        System.out.println("\t\t1.new thread will not be created\n");
        System.out.println("\t\t2.run method will execute as normal method");
        System.out.println("\t\t3.Then We can predict the output it can not varies");
        System.out.println("\t\t4.Without calling start method or directly calling start method\n" +
                "\t will not create any child thread\n");

        System.out.println("\t3.The Main difference between run() and start() method is");
        System.out.println("\t\t1.start method is internally responsible to create new thread\n" +
                "\t and it will call run method internally");
        System.out.println("\t\t2.But if we call run method directly then there will not be any\n" +
                "\t new thread will be created inside main thread only all activities will be generated");
    }
}
