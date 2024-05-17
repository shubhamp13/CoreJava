package com.multithreading.basic;
class MyThread4 extends Thread{}

public class Case4
{
    public static void main(String[] args)
    {
        MyThread4 t=new MyThread4();
        t.start();
//        t.run();
        System.out.println("case 4:");
        System.out.println("Overriding of run() method");
        System.out.println("\t1.If we are not overriding run method then after calling start method\n" +
                "\t the Thread class run method will execute which does not have any implementation\n" +
                "\t Hence output will be nothing\n");
        System.out.println("\t2.It is highly recommended to override run method otherwise there is\n" +
                "\t no use of multithreading concept");
    }
}
