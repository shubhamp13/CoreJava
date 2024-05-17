package com.multithreading.basic;
class MyThread5 extends  Thread
{
    public  void start()
    {
        super.start();
        System.out.println("start method");
    }
    public  void  run()
    {
        System.out.println("run method");
    }
}
public class Case5
{
    public static void main(String[] args)
    {
        MyThread5 t=new MyThread5();
        t.start();
        System.out.println("main method\n");
        System.out.println("case 5:");
        System.out.println("Overriding of start method");
        System.out.println("\t1.We can override start method\n");
        System.out.println("\t2.If We are calling start method then priority will be given to the method\n" +
                "\t which is present inside current class but not to the extending class\n");
        System.out.println("\t3.If we override start method which class is extending thread class then\n" +
                "\t for that class we can not create new thread it will be completed by main thread only");
    }
}
