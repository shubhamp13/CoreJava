package com.oops.overloading;

public class Case2
{
    public  void  m1(String s)
    {
        System.out.println("String method");
    }
    public  void  m1(StringBuffer s)
    {
        System.out.println("String Buffer Method");
    }

    public static void main(String[] args)
    {
        Case2 c=new Case2();
        c.m1("Shubham");
        c.m1(new StringBuffer("Shubham"));
//        c.m1(null);//ambiguous reference to m1
        System.out.println("****************************************************************\n");
        System.out.println("If Two methods having same level argument and we are passing value such\n" +
                "\t that both can take then we will get compile time error reference to m1() is ambiguous");
    }
}
