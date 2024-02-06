package com.exceptionhandling.nestedtrycatchfinallyflow;

public class Case1
{
    public static void main(String[] args)
    {
        System.out.println("If there is no exception then catch block will not be executed either of inner\n" +
                "\t or outer try\n");
        System.out.println("statement [1,2,3,4,5,6,8,9,11,12]");
        System.out.println("output:");
        try
        {
            System.out.println("statement 1");
            System.out.println("statement 2");
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
