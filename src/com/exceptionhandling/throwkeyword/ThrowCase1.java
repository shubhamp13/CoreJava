package com.exceptionhandling.throwkeyword;

public class ThrowCase1
{
    public static void main(String[] args)
    {
        System.out.println("Throw keyword is used to handover exception object manually to the JVM");
        throw new RuntimeException();
    }
}
