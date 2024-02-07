package com.exceptionhandling.throwkeyword;

public class ThrowCase4
{
    public static void main(String[] args)
    {
        System.out.println("We can not have any statement after throw otherwise we will get\n" +
                "\t compile time error saying unreachable statement");
        throw  new ArithmeticException();
//        System.out.println("hello");
    }
}
