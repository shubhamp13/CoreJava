package com.exceptionhandling.throwskeyword;
public class Case1
{
    public  static void m1()throws InterruptedException
    {
        m2();
    }
    public  static void m2()throws  InterruptedException
    {
        Thread.sleep(10000);
    }

    public static void main(String[] args) throws InterruptedException
    {
        m1();
        System.out.println("throws keyword is used to delegate responsibility of exception\n" +
                "\t handling to the caller method");
        System.out.println("If you remove one throws then we will get compile time error");
    }
}
