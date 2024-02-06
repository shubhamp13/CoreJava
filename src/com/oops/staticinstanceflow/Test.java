package com.oops.staticinstanceflow;

public class Test
{
    {
        System.out.println("First Instance Block");
        System.out.println(this);
    }
    static
    {
        System.out.println("First Static Block");
    }
    public Test()
    {
        System.out.println("Test Constructor");
    }

    public static void main(String[] args)
    {

        Test t1=new Test();
        System.out.println("Main Method\n");
        Test t2=new Test();
    }
    static
    {
        System.out.println("Second Static Block");
    }
    {
        System.out.println("Second Instance Block");
    }

}
