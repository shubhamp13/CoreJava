package com.oops.staticcontrolflow;

public class Example1
{
    static
    {
        System.out.println("Static Block 1");
        m1();
    }

    public static void main(String[] args)
    {
        System.out.println("Main Method");
        m1();
    }
    public static  void  m1()
    {
        System.out.println(i);
    }
    static
    {
        System.out.println("Static Block 2");
    }

    static int i=100;
}
