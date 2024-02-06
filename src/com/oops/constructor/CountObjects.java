package com.oops.constructor;

public class CountObjects implements  Cloneable
{
    static int count=0;
    {
        ++count;
    }
    public CountObjects()
    {

    }
    public CountObjects(int i)
    {

    }
    public CountObjects(double i)
    {

    }
    public static void CountObjects()
    {
        System.out.println("Hello");
    }

    public static void main(String[] args) throws  Exception
    {
        CountObjects();
        CountObjects c1=new CountObjects();
        CountObjects c2=(CountObjects)Class.forName("com.oops.constructor.CountObjects").newInstance();
        CountObjects c3=(CountObjects) c2.clone();
        CountObjects c4=new CountObjects(10);
        CountObjects c5=new CountObjects(10.11);
        System.out.println("The No Of Objects Are:"+count);
    }
}
