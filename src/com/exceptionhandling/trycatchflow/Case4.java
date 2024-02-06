package com.exceptionhandling.trycatchflow;

public class Case4
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("statement 1");
            System.out.println("statement 2");
            System.out.println("statement 3");
        }
        catch (Exception e)
        {
            System.out.println(5/0);
            System.out.println("statement 4");
        }
        System.out.println("statement 5");
        System.out.println("If exception is occurred other than try block then program will be terminated\n" +
                "abnormally");
    }
}
