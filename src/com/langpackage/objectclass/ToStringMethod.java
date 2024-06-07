package com.langpackage.objectclass;


import java.util.ArrayList;

public class ToStringMethod
{
    public static void main(String[] args)
    {
        String name=new String("Shubham");
        System.out.println(name);
        Integer i=new Integer(20);
        System.out.println(i);
        ArrayList a=new ArrayList();
        a.add(10);
        a.add(20);
        a.add(30);
        System.out.println(a);
        ToStringMethod tm=new ToStringMethod();
        System.out.println(tm);
    }
}
