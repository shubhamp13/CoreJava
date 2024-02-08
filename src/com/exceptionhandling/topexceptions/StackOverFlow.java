package com.exceptionhandling.topexceptions;

public class StackOverFlow
{
    public  static  void m1()
    {
        m2();
    }
    public  static  void m2()
    {
        m1();
    }

    public static void main(String[] args) {
        m1();
    }
}
