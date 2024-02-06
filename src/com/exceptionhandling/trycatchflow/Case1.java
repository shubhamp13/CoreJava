package com.exceptionhandling.trycatchflow;

public class Case1
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
            System.out.println("statement 4");
        }
        System.out.println("statement 5\n");
        System.out.println("If no exception occurs in above case then order of execution will be");
        System.out.println("\t1.statement 1");
        System.out.println("\t2.statement 2");
        System.out.println("\t3.statement 3");
        System.out.println("\t4.statement 5");
    }
}
