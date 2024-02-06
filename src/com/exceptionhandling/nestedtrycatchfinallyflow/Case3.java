package com.exceptionhandling.nestedtrycatchfinallyflow;

public class Case3
{
    public static void main(String[] args)
    {
        System.out.println("If exception occurs at statement 2 and corresponding catch block is not matched:");
        System.out.println("control flow:");
        System.out.println("statement[1,11] abnormal termination");
        System.out.println("Note:");
        System.out.println("\t1.If execution is not entered inside try block then finally block will not execute\n");
        System.out.println("\t2.finally block will be executed only if when code enters inside try block");
        try
        {
            System.out.println("statement 1");
            System.out.println(10/0);
            System.out.println("statement 3");
            try
            {
                System.out.println("statement 4");
                System.out.println("statement 5");
                System.out.println("statement 6");
            }
            catch (ArithmeticException e)
            {
                System.out.println("statement 7");
            }
            finally
            {
                System.out.println("statement 8");
            }
            System.out.println("statement 9");
        }
        catch (NullPointerException e)
        {
            System.out.println("statement 10");
        }
        finally
        {
            System.out.println("statement 11");
        }
        System.out.println("statement 12");
    }
}
