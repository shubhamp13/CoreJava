package com.exceptionhandling.nestedtrycatchfinallyflow;

public class Case5
{
    public static void main(String[] args)
    {
        System.out.println("If exception raised at statement 5 and inner catch block not matched exception\n" +
                "\t and matched with outer catch block");
        try
        {
            System.out.println("statement 1");
            System.out.println("statement 2");
            System.out.println("statement 3");
            try
            {
                System.out.println("statement 4");
                System.out.println(10/0);
                System.out.println("statement 6");
            }
            catch (NullPointerException e)
            {
                System.out.println("statement 7");
            }
            finally
            {
                System.out.println("statement 8");
            }
            System.out.println("statement 9");
        }
        catch (ArithmeticException e)
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
