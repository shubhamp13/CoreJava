package com.exceptionhandling.trycatchfinallyflow;

public class Case1
{
    public static void main(String[] args)
    {
        System.out.println("If No exception occurs then output will be");
        System.out.println("\t1.statement 1");
        System.out.println("\t2.statement 2");
        System.out.println("\t3.statement 3");
        System.out.println("\t4.statement 5");
        System.out.println("\t5.statement 6");

        System.out.println("\nOutput:");

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
        finally {
            System.out.println("statement 5");
        }
        System.out.println("statement 6");
    }
}
