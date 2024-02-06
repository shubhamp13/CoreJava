package com.oops.instancecontrolflow;

public class Child extends Parent
{
    int x=100;
    {
        m2();
        System.out.println("Child Class First Instance Block");
    }
    public Child()
    {
        System.out.println("Child Class Constructor");
    }

    public static void main(String[] args)
    {
        Child c=new Child();
        System.out.println("Main Method Of Child Class");
    }
    public  void  m2()
    {
        System.out.println(y);
    }
    {
        System.out.println("Child Class Second Instance Block");
    }
    int y=200;
}
