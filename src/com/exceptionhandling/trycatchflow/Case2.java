package com.exceptionhandling.trycatchflow;

public class Case2
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("statement 1");
            System.out.println(10/0);
            System.out.println("statement 3");
        }
        catch (Exception e)
        {
            System.out.println("statement 4");
        }
        System.out.println("statement 5");
        System.out.println("If exception occurs at statement 2 then order of execution will be:");
        System.out.println("\tstatement 1");
        System.out.println("\tstatement 4");
        System.out.println("\tstatement 5");
    }
}
