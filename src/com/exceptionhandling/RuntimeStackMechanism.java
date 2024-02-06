package com.exceptionhandling;

public class RuntimeStackMechanism
{

    public static void main(String[] args)
    {
        m1();
        System.out.println("Run Time Stack Mechanism:");
        System.out.println("\t1.For Each and Every Thread JVM is responsible to provide stack area separately\n ");
        System.out.println("\t2.For Each method call for particular thread will be stored inside stack separately\n");
        System.out.println("\t3.The area in which methods are stored inside stack are known as Stack frame\n" +
                "\t or activation area\n");
        System.out.println("\t4.After execution of method call corresponding stack frame will be removed\n");
        System.out.println("\t4.After execution of all methods stack area will be empty and empty stack area will be \n" +
                "\t removed by JVM before terminating the thread");
    }
    public  static  void m1()
    {
        m2();
    }
    public  static  void m2()
    {
        System.out.println("Hello World");
    }
}

