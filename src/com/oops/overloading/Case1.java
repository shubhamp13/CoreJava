package com.oops.overloading;

public class Case1
{
    public  void m1(String s)
    {
        System.out.println("String Method");
    }
    public  void  m1(Object o)
    {
        System.out.println("Object Method");
    }

    public static void main(String[] args)
    {
        Case1 c=new Case1();
        c.m1("Shubham");
        c.m1(new Object());
        c.m1(null);
        System.out.println("*****************************************************************\n");
        System.out.println("\t1.If class having two overloaded methods of parent child object then precedance\n" +
                "\t is always high for child object");
    }
}
