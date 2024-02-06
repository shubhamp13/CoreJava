package com.exceptionhandling.nestedtrycatchfinallyflow;

public class Case4
{
    public static void main(String[] args)
    {
        System.out.println("If an exception raised at statement 5 and corresponding catch block matched");
        System.out.println("statement [1,2,3,4,7,8,9,11,12]");
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
        catch (Exception e)
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
