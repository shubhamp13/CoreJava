package com.exceptionhandling.topexceptions;

public class ExceptionInInit
{
    static
    {
        String s=null;
        System.out.println(s.length());
    }

    public static void main(String[] args)
    {
        System.out.println("Main Method");
    }
}


