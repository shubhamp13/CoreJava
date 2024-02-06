package com.exceptionhandling.trycatchfinallyflow;

public class Case2
{
    public static void main(String[] args)
    {
        System.out.println("If exception occurs at statement 2 then control flow will be:");
        System.out.println("\t1.statement 1");
        System.out.println("\t2.statement 4");
        System.out.println("\t3.statement 5");
        System.out.println("\t4.statement 6");
        System.out.println("Execution will be completed with normal termination");
        System.out.println("\nOutput:");
        try
        {
            System.out.println("statement 1");
            System.out.println(10/0);
            System.out.println("statement 3");
        }
        catch (ArithmeticException e)
        {
            System.out.println("statement 4");
        }
        finally {
            System.out.println("statement 5");
        }
        System.out.println("statement 6");
    }
}
