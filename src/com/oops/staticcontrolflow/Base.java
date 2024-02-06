package com.oops.staticcontrolflow;

public class Base
{
    static  int i=10;
    static
    {
        m1();
        System.out.println("Base Class Static Block");
    }

    public static void main(String[] args)
    {
        m1();
        System.out.println("Base Class Main Method");
    }
    public  static  void  m1()
    {
        System.out.println(j);
    }
    static  int j=20;
}
