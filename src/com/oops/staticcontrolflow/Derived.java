package com.oops.staticcontrolflow;

public class Derived extends  Base
{
    static  int x=100;
    static
    {
        m2();
        System.out.println("Derived Class First Static Block");
    }

    public static void main(String[] args)
    {
        m2();
        System.out.println("Derived Class Main method");
    }
    public  static  void  m2()
    {
        System.out.println(y);
    }
    static
    {
        System.out.println("Derived Class Second Static Block");
    }
    static int y=200;
}
