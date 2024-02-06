package com.exceptionhandling.nestedtrycatchfinallyflow;

public class Case2
{
    public static void main(String[] args)
    {
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
