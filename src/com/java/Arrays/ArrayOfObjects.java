package com.java.Arrays;

public class ArrayOfObjects
{
    public static void main(String[] args)
    {
        Object[] a=new Object[10];
        a[0]=new Object();
        a[1]=new Integer(10);
        a[2]=new Double(10.8);
        a[3]=new String("Java");

        Number[] n=new Number[10];
        n[0]=new Integer(10);
        n[1]=new Double(20.0);
//        n[2]=new String("Java");//CTE:java.lang.String cannot be converted to java.lang.Number

    }
}
