package com.exceptionhandling.nestedtrycatchfinallyflow;

public class Case6
{
    public static void main(String[] args)
    {
        System.out.println("If exception occurs at statement 5 and both inner and outer catch block\n" +
                "\t not matched then control flow will be");
        System.out.println("statement [1,2,3,4,8,11] abnormal termination");
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
        catch (ClassCastException e)
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
