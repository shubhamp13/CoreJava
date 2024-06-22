package com.langpackage.wrapperclasses;

import com.java.methods.Test;

import java.lang.reflect.Method;

public class VoidDemo
{
    public static void main(String[] args) throws Exception
    {
        Class c=Class.forName("com.java.methods.VarArgsMethodImp");
//        Method[] methods=c.getMethods();
        Method m=c.getMethod("m1", int.class, int[].class);
        System.out.println(m.getName());
        if(m.getReturnType()==Void.TYPE)
        {
            System.out.println("Yes Method Return Type Is Void") ;
        }
        else
        {
            System.out.println("Not Void");
        }

    }
}
