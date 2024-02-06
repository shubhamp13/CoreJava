package com.oops.instancecontrolflow;

public class Parent
{
    int i=10;
    {
        m1();
        System.out.println("Parent Instance Block");
    }
    public  Parent()
    {
        System.out.println("Parent Class Constructor");
    }
    public static void main(String[] args)
    {
        Parent p1=new Parent();
        System.out.println("Parent Class Main Method");
    }
    public void  m1()
    {
        System.out.println(j);
    }
    int j=20;
}
