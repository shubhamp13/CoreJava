package com.exceptionhandling.trycatchflow;
public class Case3
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("statement 1");
            System.out.println(10/0);
            System.out.println("statement 3");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("statement 4");
        }
        System.out.println("statement 5");
        System.out.println("If exception occurs at statement 2 and corresponding catch block is not matched\n" +
                "\t then program will be terminated abnormally");
        System.out.println("statement 1");

    }
}
