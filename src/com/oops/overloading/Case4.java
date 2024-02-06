package com.oops.overloading;

public class Case4
{
    public  void m1(int x)
    {
        System.out.println("General method");
    }
    public  void m1(int ...x)
    {
        System.out.println("Var -args method");
    }
    public static void main(String[] args)
    {
        Case4 c=new Case4();
        c.m1();
        c.m1(10,20);
        c.m1(10);
        System.out.println("************************************************************************\n");
        System.out.println("In method overloading least priority will be for var args method if none\n" +
                "\t of the available method matches then only var args method will get execute");
    }
}
