package com.exceptionhandling.throwskeyword;

import java.io.IOException;

public class Case3
{
    public static void main(String[] args)
    {
        System.out.println("If try block does not have any risky code about checked exception\n" +
                "\t then we can not write checked exception in cath block other wise we will get compile time error\n");
        System.out.println("This rule is applicable for fully checked exception ");
        try
        {
            System.out.println("Hello");
        }
        catch (Exception e)//IOException is not allowed as it is fully checked
        {
            System.out.println(e);
        }
        try
        {
            System.out.println("Hello World");
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
