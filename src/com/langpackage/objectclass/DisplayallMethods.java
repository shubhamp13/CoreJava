package com.langpackage.objectclass;

import java.lang.reflect.Method;

public class DisplayallMethods
{
    public static void main(String[] args)  throws Exception
    {
        int count=0;
        Class c=Class.forName("java.lang.Object");
        Method []m=c.getDeclaredMethods();
        for(Method m1:m)
        {
            System.out.println(m1.getName());
            ++count;
        }
        System.out.println("Number Of Methods In Object Class: "+count);
    }
}
