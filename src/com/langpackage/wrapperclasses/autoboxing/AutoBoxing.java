package com.langpackage.wrapperclasses.autoboxing;

public class AutoBoxing
{
    public static void main(String[] args)
    {
        //Auto boxing is process of converting primitive-------->Wrapper object automatically
        //Compiler is used to convert Integer I1=10;
        //Compiler will convert above line as Integer I1= Integer.valueOf(10);
        //Compiler will use valueOf() method for autoboxing

        //Auto unboxing is process of converting wrapper object to primitive automatically
        //Compiler is used to convert int a=I
        //Compiler will convert above line as int a = I.intValue();
        //Compiler will use xxxValue() method internally for Auto Unboxing

        Integer I=10;
        System.out.println(I);
        int a=I;
        System.out.println(a);
    }
}
