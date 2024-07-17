package com.newupdates.defaultstaticmethods;

public interface I1
{
    public static void add(int a,int b)
    {
        System.out.println("I1:"+(a+b));
    }
}
class Test1 implements I1
{
    public static void add(int a,int b)
    {
        System.out.println("Test:"+(a+b));
    }

    public static void main(String[] args)
    {
        Test1.add(10,20);
        I1.add(10,20);
    }
}
