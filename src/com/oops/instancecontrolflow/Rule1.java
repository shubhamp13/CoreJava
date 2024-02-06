package com.oops.instancecontrolflow;

public class Rule1
{
    int i=10;
    {
        m1();
        System.out.println("First Instance Block");
    }
    public Rule1()
    {
        System.out.println("Constructor");
    }

    public static void main(String[] args)
    {
        System.out.println("Main Method");
    }
    public void  m1()
    {
        System.out.println(j);
    }
    {
        System.out.println("Second Instance Block");
    }
    int j=20;
}
