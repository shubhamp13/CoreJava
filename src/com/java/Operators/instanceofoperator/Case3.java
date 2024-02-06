package com.java.Operators.instanceofoperator;

public class Case3
{
    public static void main(String[] args)
    {
        // CTE incompatible type:
        // java.lang.thread can not be converted to java.lang.String
        Thread t=new Thread();
//        System.out.println(t instanceof String);
        System.out.println(null instanceof  Thread);
    }
}
