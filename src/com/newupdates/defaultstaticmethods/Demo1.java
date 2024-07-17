package com.newupdates.defaultstaticmethods;

public class Demo1  implements  Interf
{
    public void m1()
    {
        System.out.println("Override Version Of interface m1 method");
    }

    public static void main(String[] args)
    {
        Demo1 obj = new Demo1();
        obj.m1();
    }
}
