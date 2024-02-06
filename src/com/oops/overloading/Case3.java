package com.oops.overloading;

public class Case3
{
    public  void m1(int i,float f)
    {
        System.out.println("int float method");
    }
    public  void m1(float f,int i)
    {
        System.out.println("float - int method");
    }

    public static void main(String[] args)
    {
        Case3 c=new Case3();
        c.m1(10,10.8f);//int float method
        c.m1(10.5f,10);//float  int method
//        c.m1(10,10);//reference to m1 is ambiguous both m1(int ,float),m1(float,int) match
//        c.m1(10.5f,10.5f);//no suitable method for m1(float,float)

    }
}
