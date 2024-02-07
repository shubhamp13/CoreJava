package com.exceptionhandling.throwkeyword;

public class ThrowCase5
{
    static  ArithmeticException e;

    public static void main(String[] args)
    {
        System.out.println("If we are throwing exception object which is not initialized\n" +
                "\t then we will get runtime exception NUllPointerException");
        throw e;
    }
}
